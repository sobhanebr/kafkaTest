package co.rira.kafka.utils.notification;

import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.model.org.opennms.netmgt.config.users.User;

import javax.mail.MessagingException;
import java.util.List;

/**
 * This interface provides the operation to notify the system user a message
 */
public interface NotifierService {

    void notifyUser(User targetUser, Notification notification) throws MessagingException;

    void notifyUsers(List<User> notificationTargetList, Notification notification);
}
