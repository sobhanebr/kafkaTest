package co.rira.kafka.dao;

import co.rira.kafka.model.org.opennms.netmgt.config.notifd.NotifdConfiguration;
import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notifications;
import co.rira.kafka.utils.XMLUtils;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Log4j2
public class NotificationRepository {
    private static final String NOTIFD_FILE_PATH = "notifd-configuration.xml";
    private static final String NOTIFICATIONS_FILE_PATH = "notifications.xml";
    @Getter
    private NotifdConfiguration notifdConfiguration;
    @Getter
    private Notifications notifications;

    private final XMLUtils xmlUtils;

    @Autowired
    public NotificationRepository(XMLUtils xmlUtils) {
        this.xmlUtils = xmlUtils;
    }

    private void loadNotifications() {
        try {
            this.notifications = xmlUtils.convertXMLToObject(NOTIFICATIONS_FILE_PATH, Notifications.class);
        } catch (Exception e) {
            log.error("Unable to read from file {} ", NOTIFICATIONS_FILE_PATH, e);
            this.notifications = new Notifications();
        }
    }

    private void loadNotifd() {
        try {
            this.notifdConfiguration = xmlUtils.convertXMLToObject(NOTIFD_FILE_PATH, NotifdConfiguration.class);
        } catch (Exception e) {
            log.error("Unable to read from file {} ", NOTIFD_FILE_PATH, e);
            this.notifdConfiguration = new NotifdConfiguration();
        }
    }

    @PostConstruct
    private void initialize() {
        loadNotifd();
        loadNotifications();
    }
}
