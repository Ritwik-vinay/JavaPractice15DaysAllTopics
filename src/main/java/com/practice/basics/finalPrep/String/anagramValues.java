package com.practice.basics.finalPrep.String;

import java.util.Arrays;

public class anagramValues {
    public static void main(String[] args) {
        String str= "silent";
        String in = "listen";
        System.out.println(anagramChecker(str, in));
    }
    static boolean anagramChecker(String str, String in){
        int n1= str.length();
        int n2= in.length();

        if (n1!= n2) {
            return false;
        }
        char[] c1= str.toCharArray();
        char[] c2= in.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);

    }
}
