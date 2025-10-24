//5. You are given two sorted arrays nums1 and nums2.
//Your task is to merge them into a single array sorted in non-decreasing order

package com.demo.test.codingchallenges;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements for first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements for second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = mergeSortedArrays(nums1, nums2);

        // Display merged array using for-each loop
        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int j = 0, k = 0;

        // For-each loop for nums1
        for (int num1 : nums1) {
            while (j < nums2.length && nums2[j] <= num1) {
                merged[k++] = nums2[j++];
            }
            merged[k++] = num1;
        }

        // For-each loop for nums2 (remaining elements)
        for (int num2 : nums2) {
            if (j < nums2.length) {
                merged[k++] = nums2[j++];
            }
        }

        return merged;
        
    }
}

