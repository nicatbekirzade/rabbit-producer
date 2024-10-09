package com.example.rabbitproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bindings {

    @Bean
    public Binding notificationBinding(Queue exampleQueue, DirectExchange directExchange) {
        return BindingBuilder
                .bind(exampleQueue)
                .to(directExchange)
                .with("push");
    }
}
