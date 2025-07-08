package com.example.springdatajpahandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.springdatajpahandson.model")
public class SpringdatajpahandsonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpahandsonApplication.class, args);
    }
}
