package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class occuranceOfCharacter {
    public static void main(String[] args) {
        //countFrequency("Automation");
        countFrequency("sentence");

    }
    static void countFrequency(String input){
        input= input.toLowerCase();
        char [] arr= input.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char ch: arr){
            if (map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for (char c: map.keySet()){
            System.out.println(c + " = " + map.get(c));
        }
    }
}
