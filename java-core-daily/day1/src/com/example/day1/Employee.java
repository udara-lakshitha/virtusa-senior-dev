package com.example.day1;

public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Employee Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

