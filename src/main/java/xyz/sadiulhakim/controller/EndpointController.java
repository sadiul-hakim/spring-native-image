package xyz.sadiulhakim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {
    @GetMapping("/ping")
    public String pong() {
        return "Pong";
    }
}
