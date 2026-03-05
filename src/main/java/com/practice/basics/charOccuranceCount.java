package com.practice.basics;

import java.util.HashMap;
import java.util.Map;

public class charOccuranceCount {
    public static void main(String[] args) {
        String input= "Automation";
        charOccCount(input);
    }


    static void charOccCount(String input){
        Map<Character,Integer> map= new HashMap<>();
        char[] ch= input.toCharArray();

        for (char c: ch){
            map.put(c, map.getOrDefault(c,0)+1);

        }
        for (char c: map.keySet()){
                System.out.println(c +" : "+ map.get(c));
        }
    }
}
