package co.rira.kafka.utils.events;

import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.model.org.opennms.netmgt.config.users.User;
import org.springframework.stereotype.Component;

/**
 * This is an implementation of interface {@link EventAccessController}
 */
@Component
public class EventAccessControllerImpl implements EventAccessController {

    @Override
    public boolean hasAccess(User user, Notification notification) {
        //todo
        return true;
    }

}
