package br.com.andersonmatte.SpringBootWithKafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.logging.Logger;

public class ExampleConsumer {

    @Value("${topic.name.consumer")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload){

        // Create a Logger
        Logger logger = Logger.getLogger("br.com.andersonmatte.SpringBootWithKafka.consumer.ExampleConsumer");

        logger.info("Tópico: {}" + topicName);
        logger.info("key: {}" + payload.key());
        logger.info("Headers: {}" + payload.headers());
        logger.info("Partion: {}" + payload.partition());
        logger.info("Order: {}" + payload.value());
    }

}
