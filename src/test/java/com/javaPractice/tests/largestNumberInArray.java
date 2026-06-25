package com.javaPractice.tests;

public class largestNumberInArray {
    public static void main(String[] args){
        int[] arr={2,1,3,4,0,-1};
        largestNumberChecker(arr);

    }
    static void largestNumberChecker(int[] arr){
        int maxValue=arr[0];

        for(int i= 0; i<=arr.length-1; i++){
            if(maxValue<arr[i]){
                maxValue= arr[i];
            }
        }
        System.out.println(maxValue);
    }
    
}
