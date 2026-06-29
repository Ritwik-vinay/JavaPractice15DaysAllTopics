package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class sortingTheArr {
    public static void main(String[] args) {
        int[] a={3,2,4,1,5};
        sortWithoutSortMethod(a);
    }
    static void sortWithoutSortMethod(int[] a){
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
    }
    
}
