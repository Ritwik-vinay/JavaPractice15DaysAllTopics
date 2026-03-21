package com.practice.basics.oldBasicsJava;

public class ReverseSentence {
    public static void main(String[] args) {
        String input= "Java is a Language";
        System.out.println(revSentence(input));
    }

    static String revSentence(String str){
        String[] words= str.split(" ");
        String rev="";

        for (int i=0;i<words.length;i++){
            String result="";
            for (int j= words[i].length()-1;j>=0;j--){
                result= result+words[i].charAt(j) ;
            }
            rev=rev+result;
            if (i!=words.length-1){
                rev=rev+" ";
            }

        }




        return rev;
    }
}
