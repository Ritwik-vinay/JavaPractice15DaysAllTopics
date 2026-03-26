package com.practice.basics.tcsCodingRound;

public class wordCount {

    public static void main(String[] args) {
        String str= "Java Selenium is Programming Language";
        wordCountChecker(str);
    }

    static void wordCountChecker(String sentence){
        String[] words= sentence.trim().split("\\s+");
        int count=0;
        for (String word: words){
            count++;
        }
        System.out.println(count);

    }
}
