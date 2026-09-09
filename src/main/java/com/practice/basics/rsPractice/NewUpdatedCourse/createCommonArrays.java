package com.practice.basics.rsPractice.NewUpdatedCourse;

import java.util.Arrays;

public class createCommonArrays {
    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 7 };
        int[] b = { 6, 4, 3, 7 };
        System.out.println(Arrays.toString(commonArray(a, b)));
    }

    static int[] commonArray(int[] a, int[] b) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                   // c[index] = a[i];
                    count++;
                }
            }
        }
        int[] c = new int[count] ;
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                 if (a[i] == b[j]) {
                    c[index]=a[i];
                    index++;
            }
        }
    }
        return c;
    }
}
