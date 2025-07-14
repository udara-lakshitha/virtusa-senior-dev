package com.example.day5;

public class ElectricCar implements Vehicle {
    private double batteryKWhUsed;
    private double ratePerKWh;

    public ElectricCar(double batteryKWhUsed, double ratePerKWh) {
        this.batteryKWhUsed = batteryKWhUsed;
        this.ratePerKWh = ratePerKWh;
    }

    @Override
    public double calculateBill() {
        return batteryKWhUsed * ratePerKWh;
    }

    @Override
    public String getType() {
        return "Electric Car";
    }
}