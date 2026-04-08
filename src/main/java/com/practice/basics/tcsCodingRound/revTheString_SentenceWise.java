package com.practice.basics.tcsCodingRound;

public class revTheString_SentenceWise {
    public static void main(String[] args) {
        String input= "Java Automation";
        String in = "JhonnyEnglish";
        System.out.println(revTheSentence(in));
        System.out.println(revTheSentence(input));

    }
    static String revTheSentence(String sentence){
        String[] words= sentence.split(" ");
        String rev="";

        for (int i=0; i<=words.length-1;i++){
            for (int j=words[i].length()-1;j>=0;j--){
                rev= rev + words[i].charAt(j);
            }
            rev= rev+ " ";
        }
        return rev;
    }
}
