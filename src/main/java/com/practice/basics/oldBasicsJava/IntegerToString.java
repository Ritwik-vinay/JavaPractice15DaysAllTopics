package com.practice.basics.oldBasicsJava;

public class IntegerToString {
    public static void main(String[] args){
        int input= 123;
        String  num = Integer.toString(input);
        try {
            System.out.println("It's an Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("It's a String: " + input);
        }
    }
}
