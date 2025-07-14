package com.example.day5;

public class BillingService {
    private Vehicle vehicle;

    public BillingService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void generateBill() {
        VehicleService.printVeicleInfo(vehicle);
    }
}