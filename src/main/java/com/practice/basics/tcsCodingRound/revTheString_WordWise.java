package com.practice.basics.tcsCodingRound;

import java.util.Scanner;

public class revTheString_WordWise {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String to Convert the word: ");
        String input= scanner
                .next();
        revtheword(input);
    }
    static void revtheword(String input){
        input= input.toLowerCase();
        char[] arr= input.toCharArray();
        String rev="";
        for (int i= arr.length-1;i>=0;i--){
            rev+=arr[i] ;
        }

        System.out.println(rev);
    }
}
