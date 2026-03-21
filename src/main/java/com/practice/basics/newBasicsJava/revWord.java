package com.practice.basics.newBasicsJava;

public class revWord {
    public static void main(String[] args) {
        String sentence="Java Automation";
        System.out.println(revTheWord(sentence));
    }
    static String revTheWord(String sentence){
        String[] word= sentence.split(" ");
        String rev="";
        for (int i=0;i<=word.length-1;i++){
            for (int j=word[i].length()-1;j>=0;j--){
                rev= rev+ word[i].charAt(j);
            }
            rev=rev+" ";
        }
        return rev;
    }
}
