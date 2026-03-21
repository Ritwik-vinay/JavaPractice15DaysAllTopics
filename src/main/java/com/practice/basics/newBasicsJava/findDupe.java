package com.practice.basics.newBasicsJava;

import java.util.HashMap;
import java.util.Map;

public class findDupe {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 1, 5, 2};
        finDupeInList(input);

    }

    static void finDupeInList(int[] input) {
        Map<Integer, Integer> intMap = new HashMap<>();

        for (int i : input) {
            intMap.put(i, intMap.getOrDefault(i, 0) + 1);
        }
        for (int in : intMap.keySet()) {
            if (intMap.get(in) > 1) {
                System.out.println(in + " :-> Frequenct is -> " + intMap.get(in));
            }
        }
    }
}
