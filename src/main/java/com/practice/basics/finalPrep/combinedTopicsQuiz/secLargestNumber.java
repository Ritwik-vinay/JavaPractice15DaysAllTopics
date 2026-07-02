package com.practice.basics.finalPrep.combinedTopicsQuiz;

public class secLargestNumber {
    public static void main(String[] args) {
        int[] val={5,3,2,1,0,6};
        secLargestNumberValue(val);
    }
    static void secLargestNumberValue(int[] num){
        int max=Integer.MIN_VALUE;
        int secMax= Integer.MIN_VALUE;

        for(int n: num){
            if (n>max) {
                secMax=max;
                max=n;
            }
            else if (n>secMax && n<max) {
                secMax= n;
            }
        }
        System.out.println(secMax);
    }
    
}
