package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortAMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"Banana");
        map.put(2,"Apple");
        map.put(1,"mango");

        TreeMap<Integer, String> tree = new TreeMap<>(map);

        for (Map.Entry<Integer,String> entry: tree.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }



    }
}
