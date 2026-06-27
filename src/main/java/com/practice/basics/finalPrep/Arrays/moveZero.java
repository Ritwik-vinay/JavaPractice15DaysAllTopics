package com.practice.basics.finalPrep.Arrays;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr= {1,0,4,0,7};
        moveZerosToEnd(arr);
    }
    static void moveZerosToEnd(int[] num){
        int index=0;

        for (int i = 0; i < num.length; i++) {
            if (num[i]!=0) {
                int temp = num[i];
                num[i]= num[index];
                num[index]=temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
    
}
