package com.practice.basics.TestNewPractice;
 import java.util.*;

public class frequencyTheInteger {
    public static void main(String[] args){
        int[] a={1,2,1,2,3,4,5,6,5,1,2,2,5,5,10};
        freqChecker(a);

    }
    static void freqChecker(int[] a){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int val: a){
            if(map.containsValue(val)){
                map.put(val, map.getOrDefault(val, 0)+1);
            }
            else{
                map.put(val, 1);
            }
        }

        for(int val:a){
           System.out.println(val + " = "+ map.get(val));

        }
    }
    
}
