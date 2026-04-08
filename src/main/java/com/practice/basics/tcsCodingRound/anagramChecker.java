package com.practice.basics.tcsCodingRound;

import java.util.Arrays;

public class anagramChecker {
    public static void main(String[] args) {

        System.out.println(anagramChecker("silent","listen"));

    }
    static boolean anagramChecker(String str1, String str2){
        str1= str1.replaceAll("\\s+","").toLowerCase();
        str2= str2.replaceAll("\\s+" ,"").toLowerCase();
        boolean anagram;
        if (str1.length()!=str2.length()){
            anagram=false;
        }
        char[] ch = str1.toCharArray();
        char [] ch2= str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);

        return Arrays.equals(ch,ch2);

    }
}
