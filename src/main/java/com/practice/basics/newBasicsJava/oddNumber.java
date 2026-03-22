package com.practice.basics.newBasicsJava;

import java.util.ArrayList;
import java.util.List;

public class oddNumber {
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,7};
        System.out.println(oddNumber(arr));
    }
    static List<Integer> oddNumber(int [] values){
         List<Integer> oddList = new ArrayList<>();
         for (int i: values ){
             if (i%2!=0){
                 oddList.add(i);
             }
         }
         if (oddList.isEmpty()){
             System.out.println("No Odd Number");
         }

         return oddList;
    }
}
