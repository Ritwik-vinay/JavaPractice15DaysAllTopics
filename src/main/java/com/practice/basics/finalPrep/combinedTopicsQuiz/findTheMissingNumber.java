package com.practice.basics.finalPrep.combinedTopicsQuiz;

import java.util.*;

public class findTheMissingNumber {
    public static void main(String[] args) {
        int[] s={1,2,4};
        missingNumber(s);
        
    }
    static void missingNumber(int[] num){
        int n= num.length;
        int expected= (n+1)*(n+2)/2;
        int actualSum=0;
        
        for (int i=0;i<n;i++){
            actualSum+=num[i];
        }

        int missingnum= expected-actualSum;
        System.out.println(missingnum);
    }
}
