//1.Sum of first n even numbers
//o	Input: Integer n
//o	Output: Sum of first n even numbers

package com.demo.test.practicequestions;

import java.util.Scanner;

public class EvenNumbersSum {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: Read value of n
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        // Calculate sum of first n even numbers
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += 2 * i; // The i-th even number is 2*i
	        }

	        // Output: Display the sum
	        System.out.println("Sum of first " + n + " even numbers is: " + sum);
	        
	        sc.close();
	    }
	
		
	}


