package com.springintroduction.SpringIntro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringContollers {
    @GetMapping("/hello-w")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    // http://localhost:8080/hello/query?name=Mark
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //using  pathvariable

    @GetMapping("/hello/param/{name}")
    //http://localhost:8080/hello/param/Mark
    public String sayHello2(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    
}
