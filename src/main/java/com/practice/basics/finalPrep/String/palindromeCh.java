package com.practice.basics.finalPrep.String;

public class palindromeCh {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Hurray !!  It is a Palindrome");
        }
        else{
            System.out.println("Oops!! it is not a Palindrome");
        }
    }
}
