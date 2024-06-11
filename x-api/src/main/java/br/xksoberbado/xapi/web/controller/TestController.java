package br.xksoberbado.xapi.web.controller;

import br.xksoberbado.xapi.client.YClient;
import br.xksoberbado.xapi.event.payload.PersonPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class TestController {

    private final YClient client;
    private final KafkaTemplate<String, PersonPayload> kafkaTemplate;

    @GetMapping
    public String get() {
        log.info("Getting.");

        return client.get();
    }

    @PostMapping
    public void post() {
        final var person = PersonPayload.of(UUID.randomUUID(), "João", LocalDateTime.now());

        log.info("Sending: {}", person);

        kafkaTemplate.send("topic-example", person);
    }
}
