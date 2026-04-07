package com.practice.basics.rsPractice;

public class revTheWord {
    public static void main(String[] args) {
        String str= "TCS Drive";

        String[] input= str.split(" ");
        for (int i= input.length-1; i>=0;i--){
            System.out.print(input[i] + " ");
        }
    }
}
