package com.practice.basics.finalPrep.combinedTopicsQuiz;

import java.util.Arrays;

public class movingZeros {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 0, 0, 4, 5 };
        moveZeroVal(a);
    }

    static void moveZeroVal(int[] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[b];
                a[b] = temp;
                b++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
