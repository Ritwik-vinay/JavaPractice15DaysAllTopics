package com.practice.basics.oldBasicsJava;

public class ExtractAllDigits {
    public static void main(String[] args) {
        String in= "abc123def456ghi789";
        String in2= "Hello34World";
        System.out.println(in);
        System.out.println(returnOnlyString(in));
        System.out.println(in2);
        System.out.println(returnOnlyString(in2));
    }

    static String returnOnlyString(String input){
        return input.replaceAll("[0-9]", " ");
    }
}
