package com.brunas.producerApp.controller;

import com.brunas.producerApp.dto.UserDto;
import com.brunas.producerApp.service.ProducerTopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class UserController {

    private final ProducerTopicService producerTopicService;

    public UserController(ProducerTopicService producerTopicService) {
        this.producerTopicService = producerTopicService;
    }

    @PostMapping("/send")
    public ResponseEntity<UserDto> send(@RequestBody UserDto userDto) {
        producerTopicService.sendMessage(userDto);
        return ResponseEntity.ok(userDto);
    }
}
