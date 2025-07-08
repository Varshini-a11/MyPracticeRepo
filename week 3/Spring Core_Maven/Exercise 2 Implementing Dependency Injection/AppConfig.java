package com.example.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vehicle car() {
        return new Car();
    }

    // Constructor-based DI
    @Bean
    public TravelService travelService() {
        return new TravelService(car());
    }


}
