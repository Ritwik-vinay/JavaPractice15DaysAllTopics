package com.practice.basics.TestNewPractice;

import java.util.Scanner;

public class revTheSentence {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter the Sentence: ");
        // String in= scn.next();
        String sentence = "Java is  a programming language";

        String[] word = sentence.split(" ");
        String rev = "";
        for (int i = 0; i <= word.length - 1; i++) {
            for (int j = word[i].length() - 1; j >= 0; j--) {
                rev += word[i].charAt(j);
            }
            rev = rev + " ";
        }
        System.out.println("Rev Sentence with preserving the order : " + rev);
    }

}
