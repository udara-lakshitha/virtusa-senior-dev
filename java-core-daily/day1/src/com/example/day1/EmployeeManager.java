package com.example.day1;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 30, "HR");
        Employee e2 = new Employee("Bob", 35, "Engineering");

        e1.printInfo();
        System.out.println("---------");
        e2.printInfo();
    }
}