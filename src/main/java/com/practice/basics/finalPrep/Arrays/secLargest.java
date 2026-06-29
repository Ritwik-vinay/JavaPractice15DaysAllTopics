package com.practice.basics.finalPrep.Arrays;

public class secLargest {
    public static void main(String[] args) {
        int[] arr= {10,6,5,8,9};
        System.out.println(secLargestNumber(arr));
    }
    static int  secLargestNumber(int[] a){
        int sec= Integer.MIN_VALUE;
        int first= Integer.MIN_VALUE;

        for (int i : a) {
            if (i> first) {
                sec=first;
                first=i;
            }
            else if (i>sec) {
              sec=i;   
            }
        }
        return sec;
    }
    
}
