package com.practice.basics.tcsCodingRound;

public class revTheWordInSentence {
    public static void main(String[] args) {
        System.out.println(revTheWord("My name is ritwik vinay and i am the luckiest"));
        System.out.println(revTheWord("My name is ritwik vinay and i am the best"));

    }
    static String revTheWord(String sentence){
        String[] words= sentence.split(" ");
        String rev="";

        for (int i=0; i<= words.length-1;i++){
            for (int j= words[i].length()-1; j>=0;j--){
                rev+= words[i].charAt(j);
            }
            rev= rev+ " ";
        }
        return rev;
    }
}
