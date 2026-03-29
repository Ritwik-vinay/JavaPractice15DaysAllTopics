package com.practice.basics.tcsCodingRound;

public class convertStringToInteger {
    public static void main(String[] args) {
        String in="123abc4";
        char[] ch= in.toCharArray();
        int sum=0;
        for (char c: ch){
            if (Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
