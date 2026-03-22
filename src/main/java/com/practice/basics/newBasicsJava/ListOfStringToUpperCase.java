package com.practice.basics.newBasicsJava;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringToUpperCase {
    public static void main(String[] args) {
        String [] fruits={"orange","apple","grapes","kiwi"};
        System.out.println(uppercaseConverter(fruits));
    }
    static List<String> uppercaseConverter(String [] input){
        List<String>  list = new ArrayList<>();

        for (String i: input){
            list.add(i.toUpperCase());
        }
        return list;
    }
}
