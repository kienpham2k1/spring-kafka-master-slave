package com.example.springkafkamasterslave.controller;

import com.example.springkafkamasterslave.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    private final KafkaProducerService kafkaProducerService;

    public MessageController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }
    @PostMapping
    public void sendMessage(@RequestParam String message, @RequestParam String topic) {
        kafkaProducerService.sendMessage(topic, message);
    }
}
