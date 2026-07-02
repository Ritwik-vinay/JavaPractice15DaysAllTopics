package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class sortArrayValueNew {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 2, 1, 3 };
        sortArrayvale(arr);
    }

    static void sortArrayvale(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
