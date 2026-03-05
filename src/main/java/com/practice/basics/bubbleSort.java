package com.practice.basics;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before Sorting :> "+ Arrays.toString(arr));
        sortingArrayWithoutFunc(arr);
        System.out.println("After Sorting :> "+ Arrays.toString(arr));
    }

    static void sortingArrayWithoutFunc(int[] arr){
        int n= arr.length;
        boolean swapped;

        for (int i=0;i<n-1;i++){
            swapped=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
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
