package com.example.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for employee #" + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            Employee emp = new Employee(name, age, dept);
            employees.add(emp);
        }

        System.out.println("\nEmployee List:");
        for (Employee employee : employees) {
            employee.printInfo();
        }
        scanner.close();
    }
}