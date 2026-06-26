package com.practice.basics.finalPrep.String;

import java.util.LinkedHashMap;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcdde";
        firstNon_RepeatingCharacter(str);

    }

    static void firstNon_RepeatingCharacter(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) <= 1) {
                System.out.println(ch);
                break;
            }
        }
    }

}
