package com.practice.basics;

public class StringPalindromeChecker {
    public static void main(String[] args) {
        String s1= "Madam";
        String s2= "adam";
        System.out.println("isPalindrome: " + palindromeChecker(s1));
        System.out.println("isPalindrome: " +palindromeChecker(s2));
    }


    static boolean palindromeChecker(String str){
        str=str.toLowerCase();
        String rev = "";
        boolean isPalindrome=false;
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if (str.equals(rev)){
            return isPalindrome=true;
        }
        return isPalindrome=false;
    }
}
