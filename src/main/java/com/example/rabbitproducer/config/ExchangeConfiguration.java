package com.example.rabbitproducer.config;


import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfiguration {

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("x.example");
    }

}
