package com.practice.basics.tcsCodingRound;

public class secMax3 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,8,0,7,6,5};
        secMaxValue(arr);
    }
    static void secMaxValue(int[] arr){
        int max= arr[0];
        int secmax= arr[arr[0]-1];

        for (int n:arr){
            if (max<n){
                secmax= max;
                max=n;
            } else if (n>secmax && n<max) {
                secmax=n;
            }
        }
        System.out.println(secmax);
    }
}
