package com.example.day5;

public class GasolineCar implements Vehicle {
    private double fuelLitersUsed;
    private double pricePerLiter;

    public GasolineCar(double fuelLitersUsed, double pricePerLiter) {
        this.fuelLitersUsed = fuelLitersUsed;
        this.pricePerLiter = pricePerLiter;
    }

    @Override
    public double calculateBill() {
        return fuelLitersUsed * pricePerLiter;
    }

    @Override
    public String getType() {
        return "Gasoline Car";
    }
}