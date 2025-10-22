//2.Print multiplication table of a number
//o	Input: Integer n
//o	Output: Table from n × 1 to n × 10

package com.demo.test.practicequestions;

import java.util.Scanner;

public class MultiplicationTable {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: Integer n
	        System.out.print("Enter a number to print its multiplication table: ");
	        int n = sc.nextInt();

	        // Output: Table from n × 1 to n × 10
	        System.out.println("Multiplication table of " + n + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " × " + i + " = " + (n * i));
	        }
	        
	        sc.close();
	    }
	}



