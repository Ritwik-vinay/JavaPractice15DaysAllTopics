package com.practice.basics.tcsCodingRound;

public class palindrome {
    public static void main(String[] args) {
        String input = "madam";
        String in = "adam";
        System.out.println(palindromeChecker(in));
        System.out.println(palindromeChecker(input));
    }

    static boolean palindromeChecker(String input) {
        boolean isPalindrome = false;
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);
        if (input.equalsIgnoreCase(rev)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
