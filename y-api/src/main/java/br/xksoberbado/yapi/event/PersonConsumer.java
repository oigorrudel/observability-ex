package br.xksoberbado.yapi.event;

import br.xksoberbado.yapi.event.payload.PersonPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonConsumer {

    @KafkaListener(topics = "topic-example")
    public void consume(final PersonPayload payload) {
        log.info("Received: {}", payload);
    }
}
