package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class targetValues {
    public static void main(String[] args) {
        int [] arr={7,4,6,3,9,1};
        int target=2;
        targetSearch(arr, target);
    }
    static void targetSearch(int[] a, int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-target]);
    }
    
}
