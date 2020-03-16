package co.rira.kafka.controller;

import co.rira.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

    private final KafkaProducerService kafkaSender;

    @Autowired
    public ApacheKafkaWebController(KafkaProducerService kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @GetMapping(value = "/producer")
    public String produce(@RequestParam("message") String message) {
        kafkaSender.publish(message);
        return "Message {"+ message +"} published to the Kafka Topic \"events\" Successfully";
    }

}
