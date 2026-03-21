package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class dupeString {
    public static void main(String[] args) {
        String[] fruits= {"apple", "banana", "apple", "cherry", "banana", "date"};
        dupeStringValue(fruits);

    }

    static void dupeStringValue(String[] fruits) {
        Map<String, Integer> strMap = new HashMap<>();
        for (String fruit : fruits) {
            if (strMap.containsKey(fruit)) {
                strMap.put(fruit, strMap.getOrDefault(fruit, 0) + 1);
            }
            else {
                strMap.put(fruit,1);
            }
        }
        for (Map.Entry<String,Integer> entry: strMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " = "+entry.getValue());
            }
        }
    }
}
