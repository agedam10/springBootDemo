package com.springboot.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class RestControllerApp {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World !! The current time is: " + LocalDateTime.now();
    }
}
