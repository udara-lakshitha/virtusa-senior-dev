package com.example.day3;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void performDuties();

    void showDetails() {
        System.out.println(name + " earns " + salary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void performDuties() {
        System.out.println(name + " writes code and fix bugs");
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void performDuties() {
        System.out.println(name + " manages teams and meetings");
    }
}

public class HRModel {
    public static void main(String[] args) {
        Employee dev = new Developer("Sathya", 80000);
        Employee mgr = new Manager("Kavya", 100000);

        dev.showDetails();
        dev.performDuties();

        mgr.showDetails();
        mgr.performDuties();
    }
}