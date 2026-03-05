package com.practice.basics;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        String str= "Ritwik vinay";
        System.out.println(lengthOfString(str));
    }

    static int lengthOfString(String input){
        char[] ch= input.toCharArray();
        int sCount=0;

        for (char c: ch){
            if (c>='A' && c<='Z' || c>='a'&& c<='z'){
                sCount++;
            }
        }
        return sCount;
    }
}
