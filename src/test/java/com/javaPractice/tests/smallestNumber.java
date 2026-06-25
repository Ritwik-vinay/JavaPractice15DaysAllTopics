package com.javaPractice.tests;

public class smallestNumber {
    public static void main(String[] args){
        int[] value={12,11,14,15,17,18};
        smallestNumberInArray(value);
    }
    static void smallestNumberInArray(int[] arr){
        int min= arr[arr.length-1];

        for(int i=0;i<=arr.length-1;i++){
            if(min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println(min);
    }
    
}
