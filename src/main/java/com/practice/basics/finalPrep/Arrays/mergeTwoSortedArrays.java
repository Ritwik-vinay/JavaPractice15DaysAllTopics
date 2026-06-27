package com.practice.basics.finalPrep.Arrays;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5 };
        int[] arr = { 2, 4, 6 };
        sort_MergeArray(a, arr);
    }

    static void sort_MergeArray(int[] a, int[] arr) {
        TreeSet set = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < arr.length; j++) {
            set.add(arr[j]);
        }
        System.out.println(set);

    }

}
