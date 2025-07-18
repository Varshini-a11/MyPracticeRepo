package com.example.loanservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public String getLoanDetails() {
        return "Loan service is working!";
    }
}
