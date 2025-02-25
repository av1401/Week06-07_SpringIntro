package com.springintroduction.SpringIntro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringContollers {
    @GetMapping("/hello-w")
    public String hello(){
        return "Hello from BridgeLabz";
    }
}
