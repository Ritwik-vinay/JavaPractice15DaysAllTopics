package com.practice.basics.finalPrep.String;

public class reverseTheSentence {
    public static void main(String[] args) {
        String sentence="Java is a programming language";
        reverseTheSentencePreservingOrder(sentence);
    }

    static void reverseTheSentencePreservingOrder(String sentence) {
        String[] words= sentence.split("\\s+");
        String rev="";
        for(int i=0; i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                rev= rev+words[i].charAt(j);
            }
            rev= rev+ " ";
        }
        System.out.println(rev);
    }
}
