package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class reverseTheNum_K {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int n= arr.length;
        int[] temp= new int[n];
        for (int i = 0; i <n; i++) {
            temp[(k+i)%n]= arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
    
}
