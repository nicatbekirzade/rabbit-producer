package com.example.rabbitproducer.api.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/example-queue")
public class ProducerController {

    private final AmqpTemplate rabbitTemplate;

    @PostMapping("/publish")
    public void sendMessage(
            @RequestParam("message") String message,
            @RequestParam("messageSize") Integer messageSize) {

        for (int i = 0; i < messageSize; i++) {
            rabbitTemplate.convertAndSend("x.example", "push", message + " " + i);
        }
    }
}
