package com.practice.basics.finalPrep.Arrays;

public class sumOfValues2 {
    public static void main(String[] args) {
        int[] arr={-4, 2, -3, 1, 6};
        sum(arr);
    }

    static void sum(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    System.out.println("Subarray from "
                            + i + " to " + j);
                }
            }
        }
    }

}
