package com.practice.basics.oldBasicsJava;

public class StringToInteger {
    public static void main(String[] args) {
        String input= "1234";
        try {
            int num = Integer.parseInt(input);
            System.out.println("It's an Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("It's a String: " + input);
        }

    }
}
