package com.practice.basics;

public class StringReverse {

    public static void main(String[] args) {
        String input= "Ritwik";
        System.out.println(reversetheWord(input));
    }
    static String reversetheWord(String str){
        str = str.toLowerCase();
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
}
