package com.practice.basics.finalPrep.Arrays;

public class thirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 10, 7 };
        System.out.println(thirdLargestNumValue(arr));

    }

    static int thirdLargestNumValue(int[] a) {
        int first = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thrdMax = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > first) {
                thrdMax = secMax;
                secMax = first;
                first = num;
            }else if (num>secMax) {
                thrdMax=secMax;
                secMax=num;
            }else if (num>thrdMax) {
                thrdMax=num;
            }
        }
        return thrdMax;
    }

}
