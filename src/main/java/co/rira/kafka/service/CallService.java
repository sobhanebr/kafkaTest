package co.rira.kafka.service;

import co.rira.kafka.model.User;
import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.utils.notification.NotifierService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CallService implements NotifierService {

    @Override
    public void notifyUser(User targetUser, Notification notification) {
        log.info("Calling user[{}] according to the notification[{}]", targetUser, notification);
    }

    @Override
    public void notifyUsers(List<User> notificationTargetList, Notification notification) {
        notificationTargetList.forEach(user -> notifyUser(user, notification));
    }
}
