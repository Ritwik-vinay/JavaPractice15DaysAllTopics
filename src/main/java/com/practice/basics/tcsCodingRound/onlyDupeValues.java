package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.Map;

public class onlyDupeValues {
    public static void main(String[] args) {
        String values = "Programminggg";
        dupeValues(values);
    }

    static void dupeValues(String value) {
        value = value.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        char[] chInput = value.toCharArray();
        for (char ch : chInput) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}
