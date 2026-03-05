package com.practice.basics;

public class revWordsInString {
    public static void main(String[] args){
        String sentence = "Java Coding Interview";
        System.out.println(revString(sentence));
    }

    static String revString(String sentence){
        String rev="";
        String[] word= sentence.split(" ");
        for (int i=0; i<=word.length-1;i++){
            String result = "";

            for (int j=word[i].length()-1;j>=0;j--){
                result= result+word[i].charAt(j);
            }
            rev= rev+result;

            if (i!=word.length-1){
                rev= rev+" ";
            }
        }
        return rev;
    }
}

