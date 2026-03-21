package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input= "automation";
        findNonRepeatingChar(input);

    }
    static void findNonRepeatingChar(String str){
        char[] ch= str.toCharArray();
        Map<Character, Integer> chMap= new HashMap<>();
        for (char cha: ch){
            chMap.put(cha, chMap.getOrDefault(cha, 0)+1);
        }
        for (char c: chMap.keySet()){
            if (chMap.get(c)<=1){
                System.out.println(c + " -> First non repeating character");
                break;
            }
        }
    }
}
