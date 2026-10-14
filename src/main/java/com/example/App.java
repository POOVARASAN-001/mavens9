package com.example;

public class App {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative.");
        }
        return (principal * rate * time) / 100.0;
    }
}
