package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class sortingtheArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 5 };
       sortTheArray(arr);

    }

    static void sortTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
