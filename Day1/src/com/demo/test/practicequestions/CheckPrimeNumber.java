//1.Check if a number is prime
//o	Input: Integer n
//o	Output: True if prime, False otherwise

package com.demo.test.practicequestions;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        
        // Check if prime
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }

    // Method to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Try dividing n by every number from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // divisible, not prime
            }
        }

        return true; // no divisors found
    }
}

