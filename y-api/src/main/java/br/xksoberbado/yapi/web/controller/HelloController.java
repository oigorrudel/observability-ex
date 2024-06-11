package br.xksoberbado.yapi.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("v1/hello")
public class HelloController {

    @GetMapping
    public String get() {
        log.info("Getting.");

        return String.format("TraceId: %s", MDC.get("traceId")); //MDC.get("spanId")
    }
}
