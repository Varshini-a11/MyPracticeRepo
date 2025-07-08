package com.example.springdi;

public class TravelService {
    private Vehicle vehicle;

    // Constructor-based DI
    public TravelService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Setter-based DI
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        vehicle.start();
    }
}
