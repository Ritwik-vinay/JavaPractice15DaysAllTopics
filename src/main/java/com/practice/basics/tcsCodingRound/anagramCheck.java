package com.practice.basics.tcsCodingRound;

import java.util.Arrays;

public class anagramCheck {
    public static void main(String[] args) {
        System.out.println(anagramChecker("silent","listen"));
        System.out.println(anagramChecker("madam", "anagram"));

    }
    static boolean anagramChecker(String s1, String s2){
        s1= s1.replaceAll("\\s" ,"").toLowerCase();
        s2= s2.replaceAll("\\s","").toLowerCase();

        if (s1.length()!= s2.length()){
            return false;
        }
        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
