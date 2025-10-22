//5.Find GCD and LCM of two numbers
//o	Input: a, b
//o	Output: GCD and LCM

package com.demo.test.practicequestions;

import java.util.Scanner;

public class GCDLCM {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: a and b
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        int lcm = (a / gcd) * b;  // Calculate LCM using GCD

        // Output: GCD and LCM
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        
        sc.close();
    }

    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

}
