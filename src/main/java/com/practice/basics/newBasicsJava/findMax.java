package com.practice.basics.newBasicsJava;

public class findMax {
    public static void main(String[] args) {
        int[] val= {2,5,6,4,3,1,0};
        System.out.println(findMaxValue(val));

    }
    static int findMaxValue(int[] values){
        //Print the max value in the list
        int max= values[0];

        for (int v: values){
            if (v>max){
                max= v;
            }
        }
        return max;

    }
}
