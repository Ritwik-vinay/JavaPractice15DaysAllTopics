package com.practice.basics.finalPrep.combinedTopicsQuiz;

import java.util.*;

public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String str= "automation";
        nonRepeatChar(str);
    }
    static void nonRepeatChar(String in){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (Character ch : in.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (Character ch : in.toCharArray()) {
            if (map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }
    
    }
    
}
