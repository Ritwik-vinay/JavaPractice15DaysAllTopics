package com.practice.pages;

import java.util.HashMap;

public class interview {
    public static void main(String[] args) {
        String str= "Automation";
        dupeCharacter(str);
    }
    public  static void dupeCharacter(String str){
        str = str.toLowerCase();
        char[] ch= str.toCharArray();
        HashMap<Character, Integer> charMap= new HashMap<>();

        for (char c: ch){
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.getOrDefault(c,0)+1);
            }
            else {
                charMap.put(c ,1);
            }
        }

        for (char c: charMap.keySet()){
            if (charMap.get(c)>1) {
                System.out.println( c+ " = " +charMap.get(c) );
            }
        }

    }
}
