package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    private DivisionByZero divisionByZero;

    @BeforeEach
    void setUp() {
        divisionByZero = new DivisionByZero();
    }

    // To verify that an exception is thrown when attempting to divide by zero
    @Test
    public void shouldThrowArithmeticException() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            divisionByZero.divide(10, 0);
        });

        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}