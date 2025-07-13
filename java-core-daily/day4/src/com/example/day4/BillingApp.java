package com.example.day4;

public class BillingApp {
    public static void main(String[] args) {
        Billable item1 = new FoodProduct("Pizza", 12.5, 2);
        Billable item2 = new TechProduct("Headphones", 50.0, 1, 10.0);

        printBill(item1);
        printBill(item2);
    }

    public static void printBill(Billable item) {
        System.out.println("Item: " + item.getDescription());
        System.out.println("Total: $" + item.calculateBill());
        System.out.println("-------------------");
    }
}