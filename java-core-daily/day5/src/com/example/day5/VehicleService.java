package com.example.day5;

public class VehicleService {
    public static void printVeicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Bill Amount: $" + vehicle.calculateBill());
        System.out.println("-----------------------------");
    }
}