package com.example.demokafka.controller;

import com.example.demokafka.model.User;
import com.example.demokafka.service.KafkaProducer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/kafka/api/v1")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping
    public void PostMessage(@RequestBody User user){

        kafkaProducer.sendToKafka(user);

    }
}
