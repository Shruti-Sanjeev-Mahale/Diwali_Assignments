//3.Calculate factorial of a number
//o	Input: Integer n
//o	Output: n! (e.g., 5! = 120)

package com.demo.test.practicequestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        // Get input from user
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int result = factorial(n);
        if (result != -1) {
            System.out.println(n + "! = " + result);
        }

        sc.close();
    }

    // Method to calculate factorial 
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return -1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

