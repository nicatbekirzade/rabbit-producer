package com.example.rabbitproducer.config;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

    @Bean
    Queue exampleQueue() {
        return QueueBuilder.durable("devfest")
                .build();
    }
}
