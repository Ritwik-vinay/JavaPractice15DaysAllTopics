package com.practice.basics.tcsCodingRound;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupeChar {
    public static void main(String[] args) {
        removeDupeVal("automation");
        removeDupeVal("hello");
    }

    static void removeDupeVal(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : arr) {
            set.add(ch);
        }
        System.out.println(set.toString());

    }
}
