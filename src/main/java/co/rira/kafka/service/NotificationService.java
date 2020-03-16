package co.rira.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
@EnableAsync
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);
    private final JavaMailSender mailSender;
    @Value(value = "${app.email.address}")
    private String notifiedEmailAddress;

    @Autowired
    public NotificationService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Async
    public void notifyByEmail(String alertText) throws MessagingException {
        logger.info("Started sending email the message : {}",alertText);
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom("fivegears.rahnema@gmail.com");
        helper.setTo(notifiedEmailAddress);
        String text = "<html>\n" +
                "\n" +
                "<body dir=\"ltr\">\n" +
                "    <div>\n" +
                "            <h3>\n" +
                alertText+
                "            </h3>\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        helper.setText(text, true);
        helper.setSubject("OpenNMS Alert");
        mailSender.send(message);
    }

    public void notifyBySMS(String alertText){
        logger.info("SMS with content[{}] sent successfully",alertText);
    }

}
