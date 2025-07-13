package com.example.day4;

public class FoodProduct extends Product {
    public FoodProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateBill() {
        return price * quantity;
    }

    @Override
    public String getDescription() {
        return name + " (Food)";
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}