package com.practice.basics.oldBasicsJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pairSum {
    public static void main(String[] args) {
        int[] pair={2,3,1,5,6,8,9,4};
        int target= 13;
        List<int[]> pairs= pairSumChecker(pair,target);
        System.out.println("Pairs with sum "+ target + " : ");
        for (int[] p: pairs){
            System.out.println("( "+ p[0] +" , "+ p[1]+ ")");
        }
    }

    static List<int[]> pairSumChecker(int[] arr, int targetSum){
        List<int[]> pairs= new ArrayList<>();
        Set<Integer> visitedNumber= new HashSet<>();
        for (int num: arr){
            int complementNum= targetSum-num;
            if (visitedNumber.contains(complementNum)){
                pairs.add(new int[]{complementNum,num});
            }
            visitedNumber.add(num);
        }
        return pairs;
    }
}
