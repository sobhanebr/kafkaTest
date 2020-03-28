package co.rira.kafka.utils.events;

import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.model.org.opennms.netmgt.config.users.User;

/**
 * This interface checks if an Event can accessed by system user
 */
public interface EventAccessController {

    boolean hasAccess(User user, Notification notification);
}
