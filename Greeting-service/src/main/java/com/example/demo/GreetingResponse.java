package com.example.demo;

public class GreetingResponse {
    private String message;

    public GreetingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}