package ru.sberbank.jd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final RestTemplate restTemplate;

    @GetMapping("order/hello")
    public String getOrder() {
        // http://localhost:8081/inventory/hello
        String result = restTemplate.getForEntity("http://inventory-service:8080/inventory/hello", String.class).getBody();

        return "Hello from Order Controller: " + result;
    }
}