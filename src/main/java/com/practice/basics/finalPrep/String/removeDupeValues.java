package com.practice.basics.finalPrep.String;

import java.util.*;
public class removeDupeValues {
    public static void main(String[] args) {
        String str="banana";
        removeDupe(str);
    }
    static void removeDupe(String in){
        char[] chval= in.toLowerCase().toCharArray();
        Set<Character> chSet= new LinkedHashSet<>();
        for(char ch: chval){
            chSet.add(ch);
        }
        System.out.println(chSet);
    }
}
