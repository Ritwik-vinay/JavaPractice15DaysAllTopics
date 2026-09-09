package com.practice.basics.oldBasicsJava;

import java.util.ArrayList;
import java.util.List;

public class reverseTheArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(a);
    }

    static void reverseArray(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            arrayList.add(arr[i]);
        }

        System.out.println(arrayList);
    }
}
