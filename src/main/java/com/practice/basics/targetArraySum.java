package com.practice.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class targetArraySum {
    public  static void main(String [] args) {
        int[] arr={2,31,7,8,90,1,8,10,6,5,4,3,15,18,25,0,24};
        int target= 25;
        List<int[]> pairs= sumChecker(arr,target);
        System.out.println("Pairs that sum to: " + target);
        for (int[] p: pairs){
            System.out.println("("+ p[0] + " , " + p[1]+" )");
        }
    }

    static List<int[]> sumChecker(int[] arr, int target){
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> visitedNum = new HashSet<>();
        for (int num: arr){
            int complement = target-num;
            if (visitedNum.contains(complement)){
                pairs.add(new int[]{complement,num});
            }
            visitedNum.add(num);
        }
        return pairs;
    }
}
