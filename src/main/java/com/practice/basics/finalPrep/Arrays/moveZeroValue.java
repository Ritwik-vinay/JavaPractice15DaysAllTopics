package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class moveZeroValue {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,3,0,4};
        moveZero(arr);
    }
    static void moveZero(int[] arr){
        int in=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i]= arr[in];
                arr[in]= temp;

                in++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
