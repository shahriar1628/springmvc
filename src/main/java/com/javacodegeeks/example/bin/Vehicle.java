package com.javacodegeeks.example.bin;

import org.springframework.stereotype.Service;

public class Vehicle {
    private String vehicleName;
    public Vehicle(String name) {
        this.vehicleName = name;
    }
    public String print() {
        return vehicleName;

    }
}
