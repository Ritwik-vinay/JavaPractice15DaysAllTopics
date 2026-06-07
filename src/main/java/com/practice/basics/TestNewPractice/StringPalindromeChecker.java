

package com.practice.basics.TestNewPractice;

public class StringPalindromeChecker {
 public static void main(String[] args){
    String input= "abhishek";
    palindromeChecker(input);
 }
 static void palindromeChecker(String s){
    s=s.toLowerCase();
    String rev="";
    for(int i=s.length()-1;i>=0;i--){
        rev +=s.charAt(i);
    }
    System.out.println(s  +  " = " + rev + " reverse of String");
    if(s.equals(rev)){
        System.out.println(" IT IS A  PALINDROME");
    }
    else{
        System.out.println("!! NOT A PALINDROME");
    }
 }   
}
