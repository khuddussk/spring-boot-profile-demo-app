package com.gspann.springbootproject1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Value("${greeting.message}")
    private String greetingMessage;


    @GetMapping("/greeting")
    public String getMessage(){


        return  greetingMessage;
    }
}
