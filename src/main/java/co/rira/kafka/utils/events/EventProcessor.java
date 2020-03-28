package co.rira.kafka.utils.events;

import co.rira.kafka.model.OpennmsModelProtos;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class EventProcessor {
    public OpennmsModelProtos.Event parseEvent(byte[] message) {
        try {
            OpennmsModelProtos.Event event = OpennmsModelProtos.Event.parseFrom(message);
            log.debug("New event with uei[{}] parsed successfully", event.getUei());
            return event;
        } catch (InvalidProtocolBufferException e) {
            log.error("Error while parsing message[{}] to an event : ", message, e);
        }
        return null;
    }
}
