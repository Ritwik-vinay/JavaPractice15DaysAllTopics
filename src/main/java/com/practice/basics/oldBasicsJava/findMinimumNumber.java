package com.practice.basics.oldBasicsJava;

public class findMinimumNumber {
    public static void main(String[] args){
        int[] arr= {10, 5, 25, 8, 15, 1, 3};
        findMinimum(arr);
    }

    static void findMinimum(int[] ar){

      //  int min= ar[ar.length-1];
        int min=ar[0];

        for (int i=0;i<=ar.length-1;i++){
            if (min>ar[i]){
                min= ar[i];
            }
        }
        System.out.println(min);
    }
}
