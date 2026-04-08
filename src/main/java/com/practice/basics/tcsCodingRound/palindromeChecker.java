package com.practice.basics.tcsCodingRound;

public class palindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println(palindromeChecker("madam madam"));
        System.out.println(palindromeChecker(input));

    }

    static boolean palindromeChecker(String in) {
        String original = in;
        String[] str = in.split(" ");
        String rev = "";
        boolean isPalindrome = false;

        for (int i = 0; i <= str.length - 1; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                rev += str[i].charAt(j);
            }
            if (i < str.length - 1) {
                rev = rev + " ";
            }
        }
        return rev.equalsIgnoreCase(original);
    }
}
