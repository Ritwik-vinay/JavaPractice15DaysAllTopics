package com.practice.basics.tcsCodingRound;

public class reverseOnlyWord {
    public static void main(String[] args) {
        //Reverse a string while preserving whitespace position.
        String str= "Java selenium";
        reverseOnlyWordWithSpaces(str);
    }
    static void reverseOnlyWordWithSpaces(String sent){
        String[] word= sent.split(" ");
        String rev="";
        for (int i=0; i<=word.length-1;i++){
            for (int j=word[i].length()-1;j>=0;j--){
                rev= rev+word[i].charAt(j);
            }
            rev=rev +  " ";
        }
        System.out.println(rev);

    }
}
