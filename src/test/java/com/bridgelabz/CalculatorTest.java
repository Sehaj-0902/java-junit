package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // To test that the numbers are added correctly
    @Test
    public void testAddition() {
        int result = calculator.add(15, 5);

        Assertions.assertEquals(20, result);
    }

    // To test that the numbers are subtracted correctly
    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 3);

        Assertions.assertEquals(7, result);
    }

    // To test that the numbers are multiplied correctly
    @Test
    public void testMultiplication() {
        int result = calculator.multiply(2, 4);

        Assertions.assertEquals(8, result);
    }

    // To test that the numbers are divided correctly
    @Test
    public void testDivision() {
        int result = calculator.divide(10, 2);

        Assertions.assertEquals(5, result);
    }

    // To test that the exception is thrown when attempting to divide by zero
    @Test
    public void testDivisionByZero() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}