package br.xksoberbado.xapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "y-client", url = "localhost:9001")
public interface YClient {

    @GetMapping("v1/hello")
    String get();
}
