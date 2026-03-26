package com.practice.basics.tcsCodingRound;

import java.util.HashMap;
import java.util.Map;

public class intFrequencyCount {
    public static void main(String[] args) {
        int[] i = {1, 2, 2, 3, 4, 4, 5, 1};
        countFrequnecy(i);
    }

    static void countFrequnecy(int[] values) {
        Map<Integer, Integer> intMap = new HashMap<>();

        for (int i : values) {
            if (intMap.containsKey(i)) {
                intMap.put(i, intMap.getOrDefault(i, 0) + 1);
            } else {
                intMap.put(i, 1);
            }
        }
        for (int n : intMap.keySet()) {
            if (intMap.containsKey(n)) {
                System.out.println(n + " = " + intMap.get(n));
            }
        }
    }
}
