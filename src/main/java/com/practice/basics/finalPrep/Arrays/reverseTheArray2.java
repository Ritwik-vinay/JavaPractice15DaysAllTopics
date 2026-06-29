package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class reverseTheArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        revTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void revTheArray(int[] arr){
        int start= 0;
        int end =arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
