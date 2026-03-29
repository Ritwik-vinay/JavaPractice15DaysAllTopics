package com.practice.basics.tcsCodingRound;

import java.util.TreeMap;

public class rearrangeTheDays {
    public static void main(String[] args) {
        String[] str= {"Tueday", "Thursday","Sunday","Monday"};
        TreeMap<Integer, String> treeMap= new TreeMap<>();
        treeMap.put(1,str[2]);
        treeMap.put(2,str[3]);
        treeMap.put(3,str[0]);
        treeMap.put(4,str[1]);

        for (String s: treeMap.values()){
            System.out.println(s);
        }
    }
}
