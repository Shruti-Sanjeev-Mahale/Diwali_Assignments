//4.Check if a number is an Armstrong number
//o	Input: Integer n
//o	Output: True if sum of digits raised to power equals number

package com.demo.test.practicequestions;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Read the number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits); // Raise digit to the power of number of digits
            n /= 10;
        }

        // Output: Check if Armstrong number
        if (sum == original) {
            System.out.println("True (The number is an Armstrong number)");
        } else {
            System.out.println("False (The number is not an Armstrong number)");
        }

        sc.close();
    }

}
