package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class removeDupeInt {
    public static void main(String[] args) {
        int[] num= {1,2,3,4,5,3,6,2};
        removeDupe(num);
    }
    static void removeDupe(int[] val){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: val){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println("No Duplicates");

        for (int c: map.keySet()){
            if (map.get(c)==1){

                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}
