package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class revTheArray {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr2={1,2,3,4,5};
        revArrayValue(arr2);
        System.out.println(Arrays.toString(arr2));
        revArrayValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void revArrayValue(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
