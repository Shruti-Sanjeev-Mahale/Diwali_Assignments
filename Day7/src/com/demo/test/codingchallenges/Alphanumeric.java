//Check if a string contains only alphanumeric characters

package com.demo.test.codingchallenges;

import java.util.Scanner;

import com.demo.exceptions.codingchallenges.NonAlphanumericException;

public class Alphanumeric {
    // Main method for user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            checkAlphanumeric(input);
        } 
        catch (NonAlphanumericException e) {
            System.out.println("Exception: " + e.getMessage());
        } 

        sc.close();
    }

    // Method to check if a string is alphanumeric
    public static void checkAlphanumeric(String str) throws NonAlphanumericException {
        if (str == null) {
            throw new NonAlphanumericException("String cannot be null or empty.");
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if character is a letter (A-Z or a-z) or digit (0-9)
            if (!((c >= 'A' && c <= 'Z') || 
                  (c >= 'a' && c <= 'z') || 
                  (c >= '0' && c <= '9'))) {
                throw new NonAlphanumericException(
                        "String contains non-alphanumeric character: '" + c + "'");
            }
        }

        System.out.println("The string \"" + str + "\" is alphanumeric.");
    }
}
