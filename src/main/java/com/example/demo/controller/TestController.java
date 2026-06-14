package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TestController {

    @Value("${APP_NAME:DefaultApp}")
    private String appName;

    @GetMapping("/config")
    public String config() {
        return "Application Name: " + appName;
    }

    @GetMapping("/")
    public String home() {
        return "Hello to check db";
    }
}
