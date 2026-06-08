package com.practice.basics.TestNewPractice;

import java.util.Scanner;

public class palindromeInt {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= scn.nextInt();
        int rev=0;
        int org= n;

        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n= n/10;
        }
        System.out.println(org);
        System.out.println(rev);
        if(org == rev){
            System.out.println("IT IS A PALINDROME");
        }
        else{
            System.out.println("NOT AN PALINDROME");
        }
    }
    
}
