package com.javacodegeeks.example.config;

import com.javacodegeeks.example.bin.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.javacodegeeks.example.*" })
public class RootConfig {
    @Bean
    public Vehicle vehicle() {
        return new Vehicle("car");
    }
}
