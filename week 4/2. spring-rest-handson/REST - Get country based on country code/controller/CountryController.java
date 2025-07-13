package com.example.springdatajpahandson.controller;

import com.example.springdatajpahandson.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    // Static block to pre-load country data
    static {
        countryMap.put("IN", new Country("IN", "India", "New Delhi"));
        countryMap.put("US", new Country("US", "United States", "Washington, D.C."));
        countryMap.put("UK", new Country("UK", "United Kingdom", "London"));
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryMap.getOrDefault(code.toUpperCase(), 
            new Country("N/A", "Country Not Found", "N/A"));
    }
}
