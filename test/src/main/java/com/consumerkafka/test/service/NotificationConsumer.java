package com.consumerkafka.test.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.consumerkafka.test.event.NotificationEvent;

@Service
public class NotificationConsumer {

        @KafkaListener(topics = "notification-topic-v2", groupId = "notification-group")
        public void consume(NotificationEvent event) {
                System.out.println("Notification received!");
                System.out.println("Message: " + event.getMessage());
                System.out.println("Email: " + event.getUserEmail());
        }
}