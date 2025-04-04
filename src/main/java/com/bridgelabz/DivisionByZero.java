package com.bridgelabz;

public class DivisionByZero {
    // Method to divide number by zero and throw an exception
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}