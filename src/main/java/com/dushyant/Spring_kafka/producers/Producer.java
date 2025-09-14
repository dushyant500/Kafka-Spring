package com.dushyant.Spring_kafka.producers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	KafkaTemplate<String,String> kafkatemp;

	public void publish(String message) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		String m = "Good Morning! "+message;
		
		kafkatemp.send("Greet", m).get();
	}

	
	
}
