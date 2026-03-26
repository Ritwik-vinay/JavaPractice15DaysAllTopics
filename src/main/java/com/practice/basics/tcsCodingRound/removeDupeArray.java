package com.practice.basics.tcsCodingRound;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupeArray {
    public static void main(String[] args) {
        int[] i=  {1, 2, 2, 3, 4, 4, 5,1};
        removeDupe(i);
    }
    static void removeDupe(int [] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for (int n: arr){
            set.add(n);
        }
        System.out.println(set);
    }
}
