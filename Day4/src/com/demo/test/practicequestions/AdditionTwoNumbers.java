//1.Addition of two numbers
//o	Input: a, b
//o	Output: a + b

package com.demo.test.practicequestions;

import java.util.Scanner;

public class AdditionTwoNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: a and b
	        System.out.print("Enter first number : ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number : ");
	        int b = sc.nextInt();

	        // Output: a + b
	        int sum = a + b;
	        System.out.println("Sum: " + sum);
	        
	        sc.close();
	    }
	}


