package com.practice.basics.finalPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class merged_SortArrayList {
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] arr= {2,4,6};
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : a) {
            list.add(num);
        }
        for(int n: arr){
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
