package com.practice.basics.tcsCodingRound;

public class revTheWordPreservingSpaces {
    public static void main(String[] args) {
        String str= "Programming Language";
        String str1="Hello World";
        System.out.println(revTheWord(str));
        System.out.println(revTheWord(str1));

    }
    static String revTheWord(String original){
        original= original.toLowerCase();
        String[] in= original.split(" ");
        String rev="";
        for (int i=0; i<=in.length-1;i++){
            for (int j=in[i].length()-1;j>=0;j--){
                rev= rev+ in[i].charAt(j);
            }
            rev= rev+" ";
        }
        return rev;
    }
}
