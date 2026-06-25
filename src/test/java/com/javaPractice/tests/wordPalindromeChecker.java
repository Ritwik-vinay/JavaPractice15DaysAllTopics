package com.javaPractice.tests;

public class wordPalindromeChecker {
    public static void main(String [] args){
        String value="Programming";
        palindromeWordChecker(value);
    }
    static void palindromeWordChecker(String word){
        //word= word.toLowerCase();
        String rev="";
        for( int i=word.length()-1;i>=0;i--){
            rev+= word.charAt(i);
        }
        System.out.println(rev);
    }

    
}
