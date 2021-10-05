package br.com.andersonmatte.SpringBootWithKafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.logging.Logger;

public class ExampleProducer {

    @Value("${topic.name.producer}")
    private String topicName;

    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message){

        // Create a Logger
        Logger logger = Logger.getLogger("br.com.andersonmatte.SpringBootWithKafka.consumer.ExampleProducer");

        logger.info("Payload enviado: {}"+ message);
        kafkaTemplate.send(topicName, message);
    }

}
