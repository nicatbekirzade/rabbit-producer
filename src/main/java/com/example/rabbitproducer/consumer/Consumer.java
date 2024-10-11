package com.example.rabbitproducer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Consumer {

    @RabbitListener(queues = {"devfest"})
    public void notificationListener(String messages) {

        log.info("Consuming messages: {}", messages);

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
