//4.You are given an integer array nums and an integer k.
//Rotate the array to the right by k steps, where k is non-negative.

package com.demo.test.codingchallenges;
import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle case when k > n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the number of steps to rotate (k): ");
        int k = sc.nextInt();

        rotate(nums, k);

        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.println(num);
        }

        sc.close();
    }
}
