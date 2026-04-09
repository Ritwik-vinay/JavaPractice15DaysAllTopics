package com.practice.basics.tcsCodingRound;

import java.util.ArrayList;
import java.util.Arrays;

public class moveAllTheZeroesArray {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 2, 3, 0, 4, 5};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }

    public static int[] moveZeroes(int[] num) {
        int left = 0;
        for (int right = 0; right < num.length; right++) {
            if (num[right] != 0) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
            }
        }
        return num;
    }
}
