package com.practice.basics.tcsCodingRound;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twoStringAnagramCheck {
    public static void main(String[] args) {
        System.out.println(anagramChecker("silent","Listen"));

    }
    static boolean anagramChecker(String str1, String str2){
        str1= str1.replaceAll("\\s","").toLowerCase();
        str2= str2.replaceAll("\\s","").toLowerCase();

        if (str1.length()!= str2.length()){
            return false;
        }
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
