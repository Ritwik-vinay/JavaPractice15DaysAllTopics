package com.practice.basics.tcsCodingRound;

import java.util.*;

public class removeDupeFromArr {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 2, 4, 5};
        removeDupeVal(num);
    }

    static void removeDupeVal(int[] num) {
      Set<Integer> set = new HashSet<>();
        for (int n:num){
            set.add(n);
        }
        System.out.println(set);

    }
}
