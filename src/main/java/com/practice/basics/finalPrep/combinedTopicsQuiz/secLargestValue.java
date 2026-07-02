package com.practice.basics.finalPrep.combinedTopicsQuiz;

public class secLargestValue {
    public static void main(String[] args) {
        int [] val= {8,5,4,3,7,0,1,-1};
        secLar(val);
    }

    static void secLar(int[] in) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i : in) {
            if (i > max) {
                secMax = max;
                max = i;
            }else if (i>secMax && i<max) {
                secMax=i;
            }
        }
        System.out.println(secMax);
    }

}
