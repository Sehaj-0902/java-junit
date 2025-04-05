package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class EvenNumberCheckerTest {
    private EvenNumberChecker checkNumber;

    @BeforeEach
    void setUp() {
        checkNumber = new EvenNumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    // To verify that the method returns true if number is even
    public void shouldReturnTrueIfNumberIsEven(int number) {
        Assertions.assertTrue(checkNumber.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    // To verify that the method returns false if number is not even
    public void shouldReturnFalseIfNumberIsNotEven(int number) {
        Assertions.assertFalse(checkNumber.isEven(number));
    }
}