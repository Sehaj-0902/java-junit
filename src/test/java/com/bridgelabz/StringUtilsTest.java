package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    // To verify that the string is reversed correctly
    @Test
    public void shouldReturnReverseOfString() {
        Assertions.assertEquals("olleh", stringUtils.reverse("hello"));
    }

    // To verify that the method returns true if string is a palindrome
    @Test
    public void shouldReturnTrueIfStringIsPalindrome() {
        Assertions.assertTrue(stringUtils.isPalindrome("abba"));
        Assertions.assertFalse(stringUtils.isPalindrome("hello"));
    }

    // To verify that the string is converted to uppercase correctly
    @Test
    public void shouldConvertStringToUpperCase() {
        Assertions.assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}