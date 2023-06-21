package com.example.bankapp.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class BankController {

    @GetMapping("message")
    public String getMessage(){
        return "Hello Deployed";
    }
}
