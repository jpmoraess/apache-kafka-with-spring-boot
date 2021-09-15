package br.com.moraesit.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "${kafka.topic}", groupId = "group_id")
    public void readMessage(String message) {
        log.info("message received successfully: {}", message);
    }
}
