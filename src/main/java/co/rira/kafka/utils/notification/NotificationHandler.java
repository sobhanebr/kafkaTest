package co.rira.kafka.utils.notification;

import co.rira.kafka.dao.DestinationPathRepository;
import co.rira.kafka.dao.NotificationRepository;
import co.rira.kafka.dao.UserRepository;
import co.rira.kafka.model.OpennmsModelProtos;
import co.rira.kafka.model.User;
import co.rira.kafka.model.org.opennms.netmgt.config.destinationPaths.Path;
import co.rira.kafka.model.org.opennms.netmgt.config.destinationPaths.Target;
import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.service.CallService;
import co.rira.kafka.service.EmailService;
import co.rira.kafka.utils.events.EventAccessController;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class NotificationHandler {

    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;
    private final EmailService emailService;
    private final CallService callService;
    private final DestinationPathRepository destinationPathRepository;
    private final EventAccessController accessController;

    @Autowired
    public NotificationHandler(NotificationRepository notificationRepository, EmailService emailService, UserRepository userRepository, CallService callService, DestinationPathRepository destinationPathRepository, EventAccessController accessController) {
        this.notificationRepository = notificationRepository;
        this.emailService = emailService;
        this.userRepository = userRepository;
        this.callService = callService;
        this.destinationPathRepository = destinationPathRepository;
        this.accessController = accessController;
    }

    public void notifySubscribers(OpennmsModelProtos.Event event) {
        if (notificationDisabled() || event == null) return;
        List<Notification> notificationList = getNotificationList(event);
        notificationList.forEach(this::notifyTargetList);
    }

    private boolean notificationDisabled() {
        String notificationStatus = notificationRepository.getNotifdConfiguration().getStatus();
        return notificationStatus.equalsIgnoreCase("OFF");
    }

    private List<Notification> getNotificationList(OpennmsModelProtos.Event event) {
        List<Notification> notificationList = new ArrayList<>
                (notificationRepository.getNotifications().getNotifications());
        notificationList.removeIf(notification -> !isNotifiable(notification, event.getUei()));
        return notificationList;
    }

    private boolean isNotifiable(Notification notification, String uei) {
        List<String> allowedUEIs = Arrays.asList(uei.toLowerCase(), "match-any-uei");
        return allowedUEIs.contains(notification.getUei().toLowerCase()) &&
                notification.getStatus().equalsIgnoreCase("on");
    }

    private void notifyTargetList(Notification notification) {
        String notificationDestinationPath = notification.getDestinationPath();
        Path desiredDestinationPath = destinationPathRepository.findDestinationPathByName(notificationDestinationPath);
        if (desiredDestinationPath != null) {
            List<Target> targetList = desiredDestinationPath.getTargets();
            for (Target target : targetList) {
                User user = userRepository.findUserById(target.getName());
                if (accessController.hasAccess(user, notification)) {
                    notifyUser(user, notification, target);
                }
            }
        }
    }

    private void notifyUser(User user, Notification notification, Target target) {
        List<String> targetCommands = target.getCommands();
        for (String command : targetCommands) {
            notifyUserOnCommand(user, notification, NotificationCommand.valueOf(command));
        }
    }

    private void notifyUserOnCommand(User user, Notification notification, NotificationCommand command) {
        switch (command) {
            case JAVA_EMAIL:
                emailService.notifyUser(user, notification);
                break;
            case CALL_HOME_PHONE:
                callService.notifyUser(user, notification);
                break;
            default:
                log.error("Unsupported command was found : {}", command);
        }
    }


}
