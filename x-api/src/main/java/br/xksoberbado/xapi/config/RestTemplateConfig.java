package br.xksoberbado.xapi.config;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    RestTemplate restTemplate(final ObservationRegistry observationRegistry) {
        final var restTemplate = new RestTemplate();
        restTemplate.setObservationRegistry(observationRegistry);
        return restTemplate;
    }
}
