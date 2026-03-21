package com.practice.basics.oldBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class firstOccuranceOfCharacter {
    public static void main(String[] args) {
        String input= "programming";
        firstOccurance(input);
    }
    static void firstOccurance(String input){
        char[] charWord= input.toCharArray();
        Map<Character , Integer> charCount = new HashMap<>();

        for (char chWord: charWord){
            charCount.put(chWord,charCount.getOrDefault(chWord,0)+1);
        }

        for (char ch: charWord){
            if (charCount.get(ch)==1){
                System.out.println(ch + " = "+ charCount.get(ch));
                break;
            }
        }
    }
}
