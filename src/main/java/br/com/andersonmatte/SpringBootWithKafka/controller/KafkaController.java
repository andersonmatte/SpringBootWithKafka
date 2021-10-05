package br.com.andersonmatte.SpringBootWithKafka.controller;

import br.com.andersonmatte.SpringBootWithKafka.producer.ExampleProducer;
import org.springframework.web.bind.annotation.GetMapping;

public class KafkaController {

    private ExampleProducer exampleProducer;

    @GetMapping(value = "/send")
    public void send(){
        this.exampleProducer.send("Mensagem de teste enviada ao tópico");
    }


}
