//3.Print number pattern (e.g., triangle, pyramid)
//o	Input: Rows r
//o	Output: Pattern using loops

package com.demo.test.practicequestions;

import java.util.Scanner;

public class TrianglePattern {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: number of rows
	        System.out.print("Enter number of rows: ");
	        int r = sc.nextInt();

	        // Output: Number pattern
	        for (int i = 1; i <= r; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println(); // Move to next line
	        }
	        
	        sc.close();
   }

}
