package com.practice.basics.finalPrep.Arrays;

//import java.util.HashMap;
public class sumOfValues {
    public static void main(String[] args) {
        int[] arr={-4, 2, -3, 1, 6};
        sumOfVal(arr);
    }
    static void sumOfVal(int[] arr){
         for (int i = 0; i < arr.length; i++) {

        int sum = 0;

        for (int j = i; j < arr.length; j++) {

            sum += arr[j];

            if (sum == 0) {

                System.out.println("Subarray from "
                        + i + " to " + j);
            }
        }
    }}
    
}
