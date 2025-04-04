package com.bridgelabz;

public class StringUtils {
    // Method to reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if string is a palindrome
    public boolean isPalindrome(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();

        return reversedString.equals(str);
    }

    // Method to convert string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}