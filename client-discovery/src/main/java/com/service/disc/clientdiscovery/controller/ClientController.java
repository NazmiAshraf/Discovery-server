package com.service.disc.clientdiscovery.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String portNumber;
    
    @GetMapping(value ={"","/"})
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> body = Map.of("appName", appName, "port", portNumber);
        return ResponseEntity.ok(body);

    }
}
