package com.practice.basics.rsPractice;

public class revTheStringPreserveOrder {
    public static void main(String[] args) {
        String input= "Java Automation";
        revTheOrder(input);

    }
    static void revTheOrder(String input){
        String[] word=input.split(" ");
        String rev="";
        for (int i=0;i<=word.length-1;i++){
            for (int j=word[i].length()-1;j>=0;j--){
                rev= rev+ word[i].charAt(j);
            }
            rev= rev+ " ";
        }
        System.out.println(rev);
    }
}
