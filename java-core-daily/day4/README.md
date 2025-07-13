# Day 4 – Abstraction, Interfaces, and Billing System

## ✅ Concepts Covered

- Java interfaces and abstract classes
- `Billable` interface to represent billing logic
- `Product` as an abstract base class
- Real-world examples using `FoodProduct` and `TechProduct`

## 🧠 Key Takeaways

- Interfaces define behavior without implementation
- Abstract classes can hold common logic + abstract methods
- Real-world modeling requires flexible polymorphism
- This structure reflects how software is built in enterprise

## 🚀 Run

```bash
javac -d out $(find src -name "*.java")
java -cp out com.example.day4.BillingApp