package com.example.springdatajpahandson.controller;

import com.example.springdatajpahandson.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("India", "New Delhi", 1400000000);
    }
}
