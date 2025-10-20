//3.Check if a number is a palindrome
//o	Input: Integer n
//o	Output: True if reversed number equals original

package com.demo.test.practicequestions;

import java.util.Scanner;

public class Palindrome {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: Read the number
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        // Store the original number
	        int original = n;
	        int reversed = 0;

	        // Reverse the number
	        while (n > 0) {
	            int digit = n % 10;
	            reversed = reversed * 10 + digit;
	            n /= 10;
	        }

	        // Check if the original and reversed are the same
	        if (original == reversed) {
	            System.out.println("True (The number is a palindrome)");
	        } else {
	            System.out.println("False (The number is not a palindrome)");
	        }

	        sc.close();
	    }
	}
	
	

