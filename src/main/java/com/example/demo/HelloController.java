package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from DevOps demo!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "OK";
    }
}