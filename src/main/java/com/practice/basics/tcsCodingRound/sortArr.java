package com.practice.basics.tcsCodingRound;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

public class sortArr {
    public static void main(String[] args) {
        int [] arr= {4,5,3,2,1,0};
        System.out.println("Original ARRAY: " + Arrays.toString(arr));
        sortTheArray(arr);
        System.out.println("After sorting : "+ Arrays.toString(arr));
    }
    static void sortTheArray(int[] arr){
        int n= arr.length;
        boolean swapped;
        for (int i=0;i<n-1;i++){
            swapped=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
