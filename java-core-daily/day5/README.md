# Day 5 - Vehicle Billing System

This example demonstrates **interface-based polymorphism** using a real-world example: Electric and Gasoline car billing. Each vehicle calculates its own bill logic, and services like `BillingService` use abstraction to treat all vehicles uniformly.

### Concepts Covered:
- Interfaces and runtime polymorphism
- Layered object modeling
- Dynamic dispatch
- Interface Segregation Principle

### How to Run:
```bash
javac -d bin src/com/example/day5/*.java
java -cp bin com.example.day5.Day5App