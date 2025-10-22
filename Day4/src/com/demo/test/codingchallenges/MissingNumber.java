//3.You are given an array of size n that contains distinct numbers from 0 to n.
//Your task is to find the one number that is missing from the array.

package com.demo.test.codingchallenges;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of actual elements entered (n), i.e., one is missing from n+1 range
        System.out.print("Enter how many numbers you have: ");
        int n = sc.nextInt();

        // Ask for the starting number
        System.out.print("Enter the starting number of the sequence: ");
        int start = sc.nextInt();

        // Create array and read input
        int[] arr = new int[n];
        int actualSum = 0;

        System.out.println("Enter " + n + " distinct numbers from " + start + " to " + (start + n) + " (one is missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        // Expected sum of arithmetic sequence: (first + last) * total terms / 2
        int expectedSum = ((start + (start + n)) * (n + 1)) / 2;

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}

