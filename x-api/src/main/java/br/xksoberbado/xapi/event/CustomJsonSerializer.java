package br.xksoberbado.xapi.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.kafka.support.JacksonUtils;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class CustomJsonSerializer<T> extends JsonSerializer<T> {

    public CustomJsonSerializer() {
        super(getObjectMapper());
    }

    private static ObjectMapper getObjectMapper() {
        final var mapper = JacksonUtils.enhancedObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }
}
