
  package com.dushyant.Spring_kafka.consumers;
  
  import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
  
  @Component
  public class Consumer {

      @KafkaListener(topics = "Greet", groupId = "abcd")
      public void consumed(String message) {
          System.out.println("✅ Received message: " + message);
      }
  }