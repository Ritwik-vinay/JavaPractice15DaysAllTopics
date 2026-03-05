package com.practice.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonElementBetweenTwoArrays {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};
        Integer[] common= commonElements(array1,array2);
        System.out.println(Arrays.toString(common));
    }



    static Integer[] commonElements(Integer[] a, Integer[] b){
        Set<Integer> set= new HashSet<>(Arrays.asList(a));
        Set<Integer> commonEle = new HashSet<>();

        for (int num: b){
            if (set.contains(num)){
                commonEle.add(num);
            }
        }
        return commonEle.toArray(new Integer[0]);

    }
}
