package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.Map;

public class charCountFrequency {
    public static void main(String[] args) {
        String str="Automation";
        System.out.println(charCountFreq(str));

    }
    static Map<Character, Integer> charCountFreq(String str){
        char[] chCount = str.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char chC: chCount){
            charCount.put(chC, charCount.getOrDefault(chC, 0)+1);
        }
        return charCount;
    }
}
