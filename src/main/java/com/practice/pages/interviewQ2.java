package com.practice.pages;

public class interviewQ2 {
    public static void main(String[] args) {
        String str = "madam";

        System.out.println(isPlaindrome(str));
    }

    static boolean isPlaindrome(String str){
        str = str.toLowerCase();
        String org = str;
        String rev= "";
        boolean isPlaindrome = false;

        for ( int i=str.length()-1;i>=0; i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println(org  +" < original and reverse > " +rev);
        if (org.equals(rev)){
            isPlaindrome= true;
        }

        return isPlaindrome;
    }
}
