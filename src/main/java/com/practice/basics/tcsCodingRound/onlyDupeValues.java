package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class onlyDupeValues {
    public static void main(String[] args) {
        String values="Programminggg";
        dupeValues(values);
    }
    static void dupeValues(String value) {
        value = value.toLowerCase();
        Map<Character, Integer> map = new HashMap();
        char[] chInput = value.toCharArray();
        for (char ch : chInput) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}
