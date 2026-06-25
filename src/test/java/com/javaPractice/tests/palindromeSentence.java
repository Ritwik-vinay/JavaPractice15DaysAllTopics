package com.javaPractice.tests;

public class palindromeSentence {
    public static void main(String[] args){
        String sentence="Java is a language";
        reversingTheString(sentence);
    }
    static void reversingTheString(String sentence){
        String[] words = sentence.split("\\s+");
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev.append(words[i].charAt(j));
            }
            rev.append(' ');
        }
        System.out.println(rev.toString());
    }
}
