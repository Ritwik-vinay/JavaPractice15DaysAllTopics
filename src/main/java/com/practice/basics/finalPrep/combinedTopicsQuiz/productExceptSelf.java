package com.practice.basics.finalPrep.combinedTopicsQuiz;

import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] ans = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(products(ans)));
    }

    static int[] products(int[] num) {
        int n = num.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * num[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= num[i];
        }
        return answer;
    }

}
