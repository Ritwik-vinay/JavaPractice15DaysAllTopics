package com.practice.basics.tcsCodingRound;

public class sumOfArraysInString {
    public static void main(String[] args) {
        String str= "12abcx4";
        char [] ch= str.toCharArray();
        int sum=0;
        for (char c: ch){
            if (Character.isDigit(c)){
               sum+= Character.getNumericValue(c);
            }

        }
        System.out.println(sum);
    }
}
