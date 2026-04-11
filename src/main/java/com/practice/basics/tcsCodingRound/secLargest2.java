package com.practice.basics.tcsCodingRound;

public class secLargest2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,8,0,7,6,5};
        secLargestNum(arr);
    }
    static void secLargestNum(int[] arr){
        int max=arr[0];
        int secmax=arr[arr[0]-1];

        for (int n: arr){
            if (max<n){
                secmax=max;
                max=n;
            } else if (n>secmax && n<max) {
                secmax=n;

            }
        }
        System.out.println(secmax);
    }
}
