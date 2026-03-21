package com.practice.basics.oldBasicsJava;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String in="Hello World";
        String in1="Test Automation";
        String in2= "No Space Here";
        System.out.println(removeAllWhiteSpace(in));
        System.out.println(removeAllWhiteSpace(in1));
        System.out.println(removeAllWhiteSpace(in2));
    }
    static String removeAllWhiteSpace(String input){
        return input.replaceAll("\\s+" ,"");
    }
}
