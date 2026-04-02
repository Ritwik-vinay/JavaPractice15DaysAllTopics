package com.practice.basics.rsPractice;

public class usingStringBuilderReverse {
    public static void main(String[] args) {
        System.out.println(stringBuilderRevrse("Hello Ritwik"));

    }
    static String stringBuilderRevrse(String str){
        str= str.toLowerCase();
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
}
