package com.practice.basics.finalPrep.Arrays;

public class secLargestNumber {
    public static void main(String[] args) {
        int[] n= {1,2,4,3,5,0};
        secLargNumber(n);
    }
    static void secLargNumber(int [] arr){
        int max= arr[0];
        int secMax= arr[arr.length-1];

        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                secMax= max;
                max= arr[i];
            }
            else if(arr[i]>secMax && arr[i]<max){
                secMax= arr[i];
            }
        }
        System.out.println(secMax);
    }
}
