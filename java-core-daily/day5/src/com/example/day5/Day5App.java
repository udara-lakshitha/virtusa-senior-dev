package com.example.day5;

public class Day5App {
    public static void main(String[] args) {
        Vehicle tesla = new ElectricCar(40, 0.25);
        Vehicle bmw = new GasolineCar(20, 3.5);

        BillingService billing1 = new BillingService(tesla);
        BillingService billing2 = new BillingService(bmw);

        billing1.generateBill();
        billing2.generateBill();
    }
}