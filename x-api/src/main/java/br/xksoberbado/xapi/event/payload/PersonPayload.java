package br.xksoberbado.xapi.event.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor(staticName = "of")
public class PersonPayload {

    private UUID id;
    private String name;
    private LocalDateTime createdAt;
}
