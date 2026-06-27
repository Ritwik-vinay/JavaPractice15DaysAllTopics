package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class movingZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,3,0,4};
        movingZerosValues(arr);
    }

    static void movingZerosValues(int[] num) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[index];
                num[index] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(num));

    }
}
