package com.practice.basics.finalPrep.combinedTopicsQuiz;

import java.util.*;

public class longestConsecutiveNums {
    public static void main(String[] args) {
        System.out.println(longConsNum(new int[]{100, 4, 200, 1, 3, 2})); // 4
        System.out.println(longConsNum(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 1, 9})); // 10
        System.out.println(longConsNum(new int[]{1, 2, 0, 1})); // 3
    }
    static int longConsNum(int[] num){
        if (num==null || num.length==0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int nums : num) {
            set.add(nums);
        }
        int maxlength=0;
        for (int n : num) {
            if (!set.contains(n-1)) {
                int length=1;
                int current = n;
                while (set.contains(current+1)) {
                    current++;
                    length++;
                }
                maxlength=Math.max(maxlength, length);
            }
        }
        return maxlength;
    }
}
