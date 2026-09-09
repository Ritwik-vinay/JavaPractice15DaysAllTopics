package com.practice.newBasicsJava;

public class reversetheString {
    public static void main(String[] args) {
        String input="rahul";
        reverseString(input);
    }
    static void reverseString(String input){
        char[] word= input.toCharArray();
        String rev="";
        for(int i=word.length-1;i>=0;i--){
            rev+=word[i];
        }
        System.out.println(rev);
    }

}
