package com.practice.basics.tcsCodingRound;

public class missingNumberFinding {
    public static void main(String[] args) {
        int[] input=  {1, 2, 4, 5, 6} ;
        int target=  6;
        int missingNumber= missingNumChecker(input,target);
        System.out.println(missingNumber);
    }
    static int missingNumChecker(int[] num, int n){
        int expected= n*(n+1)/2;
        int actual=0;

        for (int nu: num){
            actual+=nu;
        }
        return expected-actual;
    }
}
