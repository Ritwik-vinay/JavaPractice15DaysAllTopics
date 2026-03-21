package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
    //Given a string, find the first non-repeating character and return its index.
    // If no such character exists, return -1.
    public static void main(String[] args) {
        String str= "aabbcdd";
        System.out.println(repeatingCharacter(str));
        str= "leetcode";
        System.out.println(repeatingCharacter(str));
        str= "aabbcc";
        System.out.println(repeatingCharacter(str));

    }
    static int repeatingCharacter(String input){
        Map<Character, Integer> count = new HashMap<>();

        for (char value: input.toCharArray()){
            count.put(value, count.getOrDefault(value,0)+1);
        }
        for (int i=0; i< input.length();i++){
            if (count.get(input.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
