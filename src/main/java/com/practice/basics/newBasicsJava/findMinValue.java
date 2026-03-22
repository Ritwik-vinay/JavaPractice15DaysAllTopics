package com.practice.basics.newBasicsJava;

public class findMinValue {
    public static void main(String[] args) {
        int[] value= {3,4,5,6,0,-1,8,9,10};
        System.out.println(minValues(value));

    }
    static int minValues(int[] value){
        int min= value[value.length-1];

        for (int i: value){
            if (i<min){
                min=i;
            }
        }
        return min;
    }
}
