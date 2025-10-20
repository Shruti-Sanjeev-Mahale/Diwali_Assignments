//5.Reverse a number
//o	Input: Integer n
//o	Output: Reversed integer

package com.demo.test.practicequestions;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Read the number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        // Handle negative numbers
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        reversed *= sign; // Restore the original sign

        // Output: Display reversed number
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }

}
