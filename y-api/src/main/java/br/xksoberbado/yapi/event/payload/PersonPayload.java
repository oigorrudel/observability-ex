package br.xksoberbado.yapi.event.payload;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class PersonPayload {

    private UUID id;
    private String name;
    private LocalDateTime createdAt;
}
