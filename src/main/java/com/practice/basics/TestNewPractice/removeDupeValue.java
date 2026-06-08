package com.practice.basics.TestNewPractice;

import java.util.*;

public class removeDupeValue {
    public static void main(String[] args) {
        String str = "Programming";
        DupeValueRemover(str);
    }

    static void DupeValueRemover(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> dupeset = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                dupeset.add(ch);
            }
        }
        System.out.println(dupeset);
    }

}
