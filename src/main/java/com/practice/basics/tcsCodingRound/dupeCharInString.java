package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.Map;

public class dupeCharInString {
    public static void main(String[] args) {
        String input = "automation";
        dupeCharacterString(input);
    }

    static void dupeCharacterString(String input) {
        char[] ch = input.toCharArray();
        Map<Character, Integer> set = new HashMap<>();

        for (char charr : ch) {
            if (set.containsKey(charr)) {
                set.put(charr, set.getOrDefault(charr, 0) + 1);
            } else {
                set.put(charr, 1);
            }
        }
        for (char c : set.keySet()) {
            if (set.get(c) > 1) {
                System.out.println(c);
            }
        }

    }
}
