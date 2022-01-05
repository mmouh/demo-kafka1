package com.example.demokafka.service;

import com.example.demokafka.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafKaConsumer {

    @KafkaListener(topics = "user",groupId = "group-id")
    public void getMessageFromKafka(User message){
        log.info("receiving message from Kafka : " + message);
        System.out.println("message consumed from kafka : " + message);
        System.out.println("user.name : "+message.getName());
        System.out.println("user hashcode : " + message.hashCode());
    }
}
