package br.xksoberbado.yapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class YApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YApiApplication.class, args);
    }

}
