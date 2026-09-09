package com.practice.newBasicsJava;

import java.util.HashMap;

public class frequecyOfCharacter {
    public static void main(String[] args) {
        String input= "Automation";
        checkFrequencyUsingHashMap(input);

    }
    static  void checkFrequencyUsingHashMap(String input){
        char[] word=input.toLowerCase().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:word){
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for(char ch: map.keySet()   ){
          //  if (map.) {
                System.out.println(ch + " = "+ map.get(ch));
          //  }
        }
    }

}
