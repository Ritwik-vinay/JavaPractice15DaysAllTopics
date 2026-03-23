package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class removeDupeString {
    public static void main(String[] args) {
        String[] input={"a","b","c","a","d","e","b"};
        removeDupe(input);
    }
    static void removeDupe(String [] str){
        Map<String , Integer> map = new HashMap<>();
        for (String s: str){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println("Removed Dupelicates");

        for (String st: map.keySet()){
            if (map.get(st)==1){
                System.out.println(st +  " = "+ map.get(st));
            }
        }
    }
}
