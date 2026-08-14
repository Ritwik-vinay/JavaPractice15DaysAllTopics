package com.practice.basics.rsPractice.NewUpdatedCourse;

public class sortTheArrayAsc {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 3, 4 };
        sortDesc(a);
        sortArrayAsc(a);
    }

    static void sortDesc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void sortArrayAsc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("***********");
        for (int i : a) {
            System.out.println(i);
        }
    }

}
