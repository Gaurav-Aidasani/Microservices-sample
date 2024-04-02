package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farewell")
public class FarewellController {

    @Autowired
    private FarewellService farewellService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public FarewellResponse getFarewell(@RequestParam("userName") String userName) {
        return farewellService.getFarewell(userName);
    }
}