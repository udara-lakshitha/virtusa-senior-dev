package com.example.day3;

class Bird {
    void fly() {
        System.out.println("Bird flies in the sky");
    }
}

class Sparrow extends Bird {
    @java.lang.Override
    void fly() {
        System.out.println("Sparrow flaps quickly");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow(); // upcasting
        Bird bird2 = new Eagle();

        bird1.fly(); // Sparrow version
        bird2.fly(); // Eagle version
    }
}