package com.practice.basics.newBasicsJava;

public class StringPalindromeChecker {
    public static void main(String[] args) {
        String input= "madam";
        palindromeCheckerStr(input);
    }
    static void palindromeCheckerStr(String str){
        String org=str.toLowerCase();
        char[] ch= org.toCharArray();
        String rev="";

        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
            
        }
        System.out.println(rev );
        //Palindrome checker conditional statement 
        if (org.equalsIgnoreCase(rev)) {
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("!!oops it is not a palindrome");
        }

    }
    
}
