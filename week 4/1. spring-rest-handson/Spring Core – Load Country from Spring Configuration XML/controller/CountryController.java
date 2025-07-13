package com.example.springdatajpahandson.controller;

import com.example.springdatajpahandson.model.Country;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:country-config.xml");
        return context.getBean("country", Country.class);
    }
}
