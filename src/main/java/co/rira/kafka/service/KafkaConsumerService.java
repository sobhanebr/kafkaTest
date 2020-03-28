package co.rira.kafka.service;

import co.rira.kafka.model.OpennmsModelProtos;
import co.rira.kafka.utils.events.EventProcessor;
import co.rira.kafka.utils.notification.NotificationHandler;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This service provides consuming
 */
@Service @Log4j2
public class KafkaConsumerService {

    private final EventProcessor eventProcessor;
    private final NotificationHandler notificationHandler;

    @Autowired
    public KafkaConsumerService(EventProcessor eventProcessor, NotificationHandler notificationHandler) {
        this.eventProcessor = eventProcessor;
        this.notificationHandler = notificationHandler;
    }

    /**
     * Consumes as a record is published to 'events' topic and sends it as an alarm
     * if it's related to a user.
     *
     * @param message event record text
     */
    @KafkaListener(topics = "events", groupId = "kafkaConsumers")
    public void consume(byte[] message) {
        log.debug("####### Consumed message: \n {} \n #######", message);
        OpennmsModelProtos.Event parsedEvent = eventProcessor.parseEvent(message);
        if (parsedEvent!=null){
            notifySubscribedUsers(parsedEvent);
        }
    }

    private void notifySubscribedUsers(OpennmsModelProtos.Event event) {
        notificationHandler.notifySubscribers(event);
    }
}
