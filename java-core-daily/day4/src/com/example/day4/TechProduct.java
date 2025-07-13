package com.example.day4;

public class TechProduct extends Product {
    private double warrantyFee;

    public TechProduct(String name, double price, int quantity, double warrantyFee) {
        super(name, price, quantity);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double calculateBill() {
        return (price * quantity) + warrantyFee;
    }

    @Override
    public String getDescription() {
        return name + (" Tech with warranty");
    }

    @Override
    public String getCategory() {
        return "Technology";
    }
}