package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping
    public GreetingResponse getGreeting(@RequestBody GreetingRequest greetingRequest) {
        return greetingService.getGreeting(greetingRequest);
    }
}