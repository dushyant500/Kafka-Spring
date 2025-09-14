# Spring Boot Kafka Demo

This project demonstrates a **basic Kafka implementation** in a Spring Boot application with a **Producer** and a **Consumer**.  

## Features
- Spring Boot application integrated with **Apache Kafka**  
- Producer publishes messages to a Kafka topic  
- Consumer listens to the topic and processes incoming messages  
- Simple REST endpoint to trigger message publishing  

## How It Works
1. Start Kafka broker (single-node or cluster).  
2. Run the Spring Boot application.  
3. Hit the REST endpoint to publish a message to Kafka.  

### REST Endpoint
http://localhost:8080/greet?message=Welcome


- This will publish `"Good Morning! Welcome"` to the Kafka topic **Greet**.  
- The **Consumer** subscribed to the `Greet` topic will automatically receive and log the message.  

## Requirements
- **Java 17+**  
- **Apache Kafka 3.x+** running locally (`localhost:9092`)  
- Maven/Gradle for build  

## Project Structure
- `Producer` → Publishes messages to Kafka topic.  
- `Consumer` → Listens to Kafka topic and logs messages.  
- `TestController` → Exposes a REST endpoint to send test messages.  

## Run the Project
1. Start Kafka broker locally.  
2. Run the Spring Boot application:  
   ```bash
   mvn spring-boot:run

