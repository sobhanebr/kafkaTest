package co.rira.kafka.controller;

import co.rira.kafka.service.KafkaPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/javainuse-kafka/")
public class ApacheKafkaWebController {

    @Autowired
    KafkaPublisherService kafkaSender;

    @GetMapping(value = "/producer")
    public String produce(@RequestParam("message") String message) {
        kafkaSender.publish(message);
        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

}
