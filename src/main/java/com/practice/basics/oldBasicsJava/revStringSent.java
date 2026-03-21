package com.practice.basics.oldBasicsJava;

public class revStringSent {
    public static void main(String[] args) {
        String in1= "Java is a Programming language";
        String in2= "Ritwik";
        System.out.println(revStringSentence(in1));
        System.out.println(revStringSentence(in2));
    }


    static String revStringSentence(String input){
        String[] words= input.split(" ");
        String rev="";
        for (int i=0;i<=words.length-1;i++){
            String result="";
            for (int j=words[i].length()-1;j>=0;j--){
                result= result+ words[i].charAt(j);
            }
            rev= rev+result;

            if (i!=words.length-1){
                rev = rev+" ";
            }
        }
        return rev;
    }
}
