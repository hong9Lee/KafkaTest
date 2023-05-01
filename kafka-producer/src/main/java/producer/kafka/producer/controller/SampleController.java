package producer.kafka.producer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import producer.kafka.producer.service.KafkaProducer;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SampleController {
    private final KafkaProducer producer;

    @PostMapping(value = "/message")
    public String sendMessage(@RequestParam("message") String message) {
        System.out.println("##");
        this.producer.sendMessage(message);
        return "success";
    }
}
