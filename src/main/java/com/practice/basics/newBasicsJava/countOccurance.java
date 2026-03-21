package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class countOccurance {
    public static void main(String[] args) {
        String str = "Automation";
        occuranceCount(str);
    }

    static void occuranceCount(String word) {
        word = word.toLowerCase();
        char[] ch = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char cha : ch) {
            map.put(cha, map.getOrDefault(cha, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) >= 1) {
                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}
