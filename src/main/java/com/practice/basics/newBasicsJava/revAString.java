package com.practice.basics.newBasicsJava;

public class revAString {
    public static void main(String[] args) {
        String input="Java automation";
        System.out.println(revString(input));
    }
    static String revString(String input){
        String rev="";
        for (int i =input.length()-1; i>=0;i--){
            rev+= input.charAt(i);
        }
        return rev;
    }
}
