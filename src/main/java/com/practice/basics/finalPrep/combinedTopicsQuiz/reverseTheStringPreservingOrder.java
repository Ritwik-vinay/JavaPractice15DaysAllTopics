package com.practice.basics.finalPrep.combinedTopicsQuiz;

public class reverseTheStringPreservingOrder {
    public static void main(String[] args) {
        String s="Java is easy";
        String s1="I Love Java";
        preservingOrderRevMethod(s);
        preservingOrderRevMethod(s1);
    }
    static void preservingOrderRevMethod(String str){
        //str= str.toLowerCase();
        String[] words = str.split("\\s+");
        String rev="";

        for(int i=0; i<words.length;i++){
            for (int j = words[i].length()-1; j >=0; j--) {
                rev=rev+ words[i].charAt(j);
            }
            rev= rev+" ";
        }
        System.out.println(rev);
    }
    
}
