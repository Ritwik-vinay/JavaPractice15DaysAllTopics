package com.practice.basics.newBasicsJava;

public class longestString {
    public static void main(String[] args) {
        String[] str={"Java","Automation","Validations","API","Selenium"};
        longStringCheckerFromList(str);
    }
    static void longStringCheckerFromList(String[] input){
     String longest="";
     for (String str: input){
         if (str.length()>longest.length()){
             longest=str;
         }
     }
        System.out.println(longest);
    }
}
