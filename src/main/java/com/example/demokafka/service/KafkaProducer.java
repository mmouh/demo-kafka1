package com.example.demokafka.service;

import com.example.demokafka.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;

    public void sendToKafka(User message){
        log.info("sending message : "+message);
        this.kafkaTemplate.send("user",message );
    }
    
    
}
