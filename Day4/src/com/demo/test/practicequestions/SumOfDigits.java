//4.Sum of digits of a number
//o	Input: Integer n
//o	Output: Sum of all digits

package com.demo.test.practicequestions;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: integer n
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        // If number is negative, convert to positive manually
        if (temp < 0) {
            temp = -temp;
        }

        // Calculate sum of digits
        while (temp > 0) {
            int digit = temp % 10; // Extract last digit
            sum += digit;          // Add to sum
            temp /= 10;            // Remove last digit
        }

        // Output: sum of digits
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }

}
