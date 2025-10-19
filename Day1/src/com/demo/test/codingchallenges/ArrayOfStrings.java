//1. You are given an array of strings. 
//Your task is to determine the length of the longest string in the array.

package com.demo.test.codingchallenges;

import java.util.Scanner;

public class ArrayOfStrings {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Get the number of strings from user
	        System.out.print("Enter the number of words: ");
	        int n = sc.nextInt();
	        sc.nextLine();  // Consume leftover newline

	        // Create the array
	        String[] words = new String[n];

	        // Get words from user
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter word " + (i + 1) + ": ");
	            words[i] = sc.nextLine();
	        }

	        // Call method
	        printLongestString(words);

	        sc.close();
	    }

	    // Method to find and print the longest string and its length
	        public static void printLongestString(String[] arr) {
	        if (arr == null || arr.length == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }

	        String longest = arr[0];

	        for (String word : arr) {
	            if (word.length() > longest.length()) {
	                longest = word;
	            }
	        }

	        System.out.println("Longest string: " + longest);
	        System.out.println("Length: " + longest.length());
	    }

}
