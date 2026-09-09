package com.practice.basics.newBasicsJava;

import java.util.HashSet;
import java.util.Set;

public class firstNon_RepeatingCharacter {
    public static void main(String[] args) {
        String input = "Automation";
        nonRepeatingCharacterChecker(input);
    }

    static void nonRepeatingCharacterChecker(String input) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        char[] ch = input.toLowerCase().toCharArray();

        for (char c : ch) {
            if (!seen.add(c)) {
                duplicate.add(c);
            }
        }

        for (char c : ch) {
            if (!duplicate.contains(c)) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
