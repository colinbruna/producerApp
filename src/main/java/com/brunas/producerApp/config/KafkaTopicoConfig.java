package com.brunas.producerApp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicoConfig {

    @Bean
    public NewTopic topic() {
        return new NewTopic("user-topic", 1, Short.valueOf("1"));
    }
}
