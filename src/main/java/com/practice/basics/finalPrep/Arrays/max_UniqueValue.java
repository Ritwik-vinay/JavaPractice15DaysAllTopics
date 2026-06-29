package com.practice.basics.finalPrep.Arrays;

import java.util.*;

public class max_UniqueValue {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 3, 4, 8,8};
        uniqueMaxVal(arr);
    }
    static void uniqueMaxVal(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        int max=0;

        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (int i : a) {
            if (map.get(i)==1  && i>max) {
                max=i;
            }
        }
        System.out.println("Unique value's Max number "+ max);
    } 
    
}
