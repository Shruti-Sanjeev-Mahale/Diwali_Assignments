//4.Generate Fibonacci series up to n terms
//o	Input: Integer n
//o	Output: First n Fibonacci numbers

package com.demo.test.practicequestions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacci(n);

        sc.close();
    }

    // Method to print the first n Fibonacci numbers
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            // Compute next term
            int next = first + second;
            first = second;
            second = next;

            System.out.println(first);
        }
    }
}

