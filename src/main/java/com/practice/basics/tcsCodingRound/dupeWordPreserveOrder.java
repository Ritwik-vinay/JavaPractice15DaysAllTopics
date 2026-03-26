package com.practice.basics.tcsCodingRound;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class dupeWordPreserveOrder {
    public static void main(String[] args) {
        String str ="automation";
        dupePreserveOrder(str);
    }
    static void dupePreserveOrder(String input) {
        input = input.replaceAll("\\s" ,"").toLowerCase();
        Set<Character> setInput= new LinkedHashSet<>();
        char[] ch= input.toCharArray();
        for (char c: ch){
            setInput.add(c);
        }

        System.out.println(setInput);
    }
}
