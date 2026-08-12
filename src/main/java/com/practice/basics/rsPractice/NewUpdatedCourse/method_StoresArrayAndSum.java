package com.practice.basics.rsPractice.NewUpdatedCourse;

public class method_StoresArrayAndSum {
    public static int sum(int[] arr) {
        int s = 0;
        if (arr != null) {
            for (int v : arr) s += v;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Sum: " + sum(a));
    }
}
