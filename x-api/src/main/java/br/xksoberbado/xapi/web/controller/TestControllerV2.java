package br.xksoberbado.xapi.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("v2")
@RequiredArgsConstructor
public class TestControllerV2 {

    private final RestTemplate restTemplate;

    @GetMapping
    public String get() {
        log.info("Getting.");

        return restTemplate.getForObject("http://localhost:9001/v1/hello", String.class);
    }
}
