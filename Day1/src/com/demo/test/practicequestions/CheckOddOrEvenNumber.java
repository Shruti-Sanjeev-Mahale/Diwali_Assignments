//5.Check if a number is even or odd
//o	Input: Integer n
//o	Output: "Even" or "Odd"

package com.demo.test.practicequestions;

import java.util.Scanner;

public class CheckOddOrEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check even or odd
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        sc.close();
    }
}

