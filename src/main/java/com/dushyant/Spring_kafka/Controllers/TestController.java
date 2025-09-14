package com.dushyant.Spring_kafka.Controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dushyant.Spring_kafka.producers.Producer;

@RestController
public class TestController {

	@Autowired
	Producer prod;
	
	@GetMapping("/greet")
	public void greetPerson(@RequestParam String message) throws InterruptedException, ExecutionException{
		prod.publish(message);
	}
	
}
