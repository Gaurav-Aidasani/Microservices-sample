package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secgreeting")
public class SecondaryGreetingController {

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping
    public SecondaryGreeting getSecGreeting() {
        return new SecondaryGreeting("Hello from Secondary Greeting Service!");
    }
}