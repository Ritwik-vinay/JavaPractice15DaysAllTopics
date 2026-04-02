package com.practice.basics.rsPractice;

public class revAString {
    public static void main(String[] args) {
        //Reversing The String
        String str= "ymedacAyttehSluhaR";
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+= str.charAt(i);
        }
        System.out.println(rev);
    }
}
