package com.practice.basics.tcsCodingRound;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupeString {
    public static void main(String[] args) {
        String[] str= {"a","b","c","c","d","a","b"};
        removedDupe(str);
    }
    static void removedDupe(String[] str){
        Set<String> set = new HashSet<>();

        for (String s: str){
            set.add(s);
        }
        System.out.println(set);
    }
}
