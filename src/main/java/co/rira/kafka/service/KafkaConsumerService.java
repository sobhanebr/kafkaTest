package co.rira.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
    private final NotificationService notificationService;


    @Autowired
    public KafkaConsumerService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "events", groupId = "kafkaConsumers")
    public void consume(String message) {
        logger.info("#### -> Consumed message -> {}", message);
        try {
            notificationService.notifyByEmail(message);
        } catch (MessagingException e) {
            logger.error("Error while sending email with content : {}", message, e);
        }
        notificationService.notifyBySMS(message);
    }
}
