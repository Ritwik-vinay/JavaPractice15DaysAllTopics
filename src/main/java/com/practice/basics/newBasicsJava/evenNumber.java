package com.practice.basics.newBasicsJava;

import java.util.ArrayList;
import java.util.List;

public class evenNumber {
    public static void main(String[] args) {
        int[] val = {5, 7, 9, 1, 2, 4};
        System.out.println(evenNumberChecker(val));
    }
    static List<Integer> evenNumberChecker(int[] val) {
        List<Integer> evenNumber = new ArrayList<>();
        for (int i : val) {
            if (i % 2 == 0) {
                evenNumber.add(i);
            }
        }
        if (evenNumber.isEmpty()){
            System.out.println("No Even Number Present  : ");
        }
        return evenNumber;
    }
}
