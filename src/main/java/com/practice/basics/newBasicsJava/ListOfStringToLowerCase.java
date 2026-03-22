package com.practice.basics.newBasicsJava;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringToLowerCase {
    public static void main(String[] args) {
        String[] veg ={"POTATO","BRINJAL","CABBAGE","CAULIFLOWER"};
        System.out.println(lowerCaseConverter(veg));

    }
    static List<String> lowerCaseConverter(String[] values){
        List<String> list= new ArrayList<>();
        for (String i: values){
            list.add(i.toLowerCase());
        }
        return list;
    }
}
