package com.practice.basics.oldBasicsJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(dupeElement(arr));
    }
    static List<Integer> dupeElement(int[] arr){
        HashSet<Integer> set= new HashSet<>();
        List<Integer> dupe= new ArrayList<>();

        for (int num: arr){
            if (!set.add(num)){
                dupe.add(num);
            }
        }
        return dupe;
    }
}
