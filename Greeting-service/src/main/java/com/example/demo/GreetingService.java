package com.example.demo;

import com.example.demo.GreetingRequest;
import com.example.demo.GreetingResponse;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public GreetingResponse getGreeting(GreetingRequest greetingRequest) {
        String userName = greetingRequest.getUserName();
        String message = "Hello, " + userName + "!";
        return new GreetingResponse(message);
    }
}