package com.practice.basics.oldBasicsJava;

import java.util.Arrays;

public class mergedTwoSortedArrays {
    public static void main(String[] args) {
        int[] a= {2,1,3,4,5};
        int[] b= {4,5,9,8,7,6};
        mergeArrays(a,b);
    }

    static void mergeArrays(int[] a, int[] b){
        //first sort both the arrays
        //then add the first array to second array
        int[] merged=new int[a.length + b.length];

        System.arraycopy(a,0,merged,0,a.length);

        System.arraycopy(b, 0, merged,a.length,b.length);

        Arrays.sort(merged);

        System.out.println("Merged and Sorted  "+ Arrays.toString(merged));



    }
}
