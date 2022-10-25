package com.brunas.producerApp.service;

import com.brunas.producerApp.dto.UserDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerTopicService {

    private final KafkaTemplate<String, UserDto> kafkaTemplate;

    public ProducerTopicService(KafkaTemplate<String, UserDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserDto userDto) {
        System.out.println("Producer, send: " + userDto);
        kafkaTemplate.send("user-topic", userDto);
    }
}
