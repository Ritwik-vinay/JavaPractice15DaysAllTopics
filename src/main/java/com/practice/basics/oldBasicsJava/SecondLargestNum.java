package com.practice.basics.oldBasicsJava;

public class SecondLargestNum {
    public static void main(String[] args){
        int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.println(secLargesetNum(numbers));
    }
    static int secLargesetNum(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        for (int num:arr){
            if (largest<num){
                secLargest=largest;
                largest=num;
            } else if (num>secLargest && num!= largest) {
                secLargest= num;
            }
        }
        return secLargest;
    }
}
