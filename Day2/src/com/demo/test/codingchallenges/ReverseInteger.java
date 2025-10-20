//2. Given an integer n, reverse its digits and return the reversed number.
//Ignore leading zeros in the reversed result.

package com.demo.test.codingchallenges;

public class ReverseInteger {

    // Method to reverse the digits of an integer
    public static int reverseNumber(int n) {
        int reversed = 0; // Variable to store the reversed number

        // Loop until all digits are processed
        while (n != 0) {
            int digit = n % 10;      // Get the last digit of the number
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10;                 // Remove the last digit from the original number
        }

        return reversed; // Return the reversed number
    }

    public static void main(String[] args) {
        int num = 1200; // Input number
        int reversed = reverseNumber(num); // Call the reverse method
        System.out.println("Reversed number: " + reversed); // Output the result
    }
}
