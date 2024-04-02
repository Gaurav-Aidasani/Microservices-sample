package com.example.demo;

import com.example.demo.FarewellResponse;
import org.springframework.stereotype.Service;

@Service
public class FarewellService {
    public FarewellResponse getFarewell(String userName) {
        String message = "Goodbye, " + userName + "! Have a great day.";
        return new FarewellResponse(message);
    }
}