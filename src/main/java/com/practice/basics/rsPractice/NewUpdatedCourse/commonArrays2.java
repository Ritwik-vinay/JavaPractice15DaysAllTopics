package com.practice.basics.rsPractice.NewUpdatedCourse;

import java.util.ArrayList;

public class commonArrays2 {
    public static void main(String[] args) {
        int[] a = { 1, 4, 8, 12, 15 };
        int[] b = { 1, 3, 8, 12, 0 };
        getCommonArray(a, b);
    }

    static void getCommonArray(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                al.add(a[i]);
            }
        }

        Object[] ab = al.toArray();
        for (Object obj : ab) {
            System.out.println(obj);
        }

    }

}
