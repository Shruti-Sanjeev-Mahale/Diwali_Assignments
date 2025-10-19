//2.Generate all prime numbers up to n
//o	Input: Integer n
//o	Output: List of primes ≤ n

package com.demo.test.practicequestions;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        printPrimes(n);

        sc.close();
    }

    // Function to print all prime numbers up to n
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is prime
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

