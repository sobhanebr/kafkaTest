package co.rira.kafka.service;

import co.rira.kafka.model.User;
import co.rira.kafka.model.org.opennms.netmgt.config.notifications.Notification;
import co.rira.kafka.utils.notification.NotifierService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.List;

/**
 * This class manages sending notifications, using SMTP through JavaMailSender
 */
@Service
@EnableAsync
@Log4j2
public class EmailService implements NotifierService {

    private final JavaMailSender mailSender;
    /**
     * SMTP email address (Can be set in /resources/application.properties)
     */
    @Value(value = "${spring.mail.username}")
    private String emailSenderAddress;

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Sends email to the user
     *
     * @param message email content
     * @throws MessagingException if cannot send
     */
    @Async
    public void notifyUser(String message) throws MessagingException {
        /*
        log.debug("Started sending email to the : {}", notifiedEmailAddress);
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setFrom(emailSenderAddress);
        helper.setTo(notifiedEmailAddress);
        String text = "<html>\n" +
                "\n" +
                "<body dir=\"ltr\">\n" +
                "    <div>\n" +
                "            <h3>\n" +
                message +
                "            </h3>\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
        helper.setText(text, true);
        helper.setSubject("OpenNMS Alert");
        mailSender.send(mimeMessage);
        log.debug("An email was sent to the {} successfully", notifiedEmailAddress);
         */
    }

    @Override
    @Async
    public void notifyUser(User targetUser, Notification notification) throws MessagingException {
        //todo
    }

    @Override
    @Async
    public void notifyUsers(List<User> notificationTargetList, Notification notification) {
        notificationTargetList.forEach(user -> {
            try {
                notifyUser(user, notification);
            } catch (MessagingException e) {
                log.error("Error while sending notification[{}] to user[{}]", notification, user, e);
            }
        });
    }
}
