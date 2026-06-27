package com.practice.basics.finalPrep.Arrays;

public class twoPointerSort_Merged {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5 };
        int[] b = { 2,4,6};
        merged_and_Sorted_Array(a, b);

    }

    static void merged_and_Sorted_Array(int[] a, int[] arr) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < arr.length) {
            if (a[i] < arr[j]) {
                System.out.print(a[i++] + " ");
            } else {
                System.out.print(arr[j++] + " ");
            }
        }
        while (i < a.length) {
            System.out.print(a[i++] + " ");
        }
        while (j < arr.length) {
            System.out.print(arr[j++] + " ");
        }
    }

}
