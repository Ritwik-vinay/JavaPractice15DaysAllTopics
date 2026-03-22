package com.practice.basics.newBasicsJava;

public class calculateSumOfElement {
    public static void main(String[] args) {
        int[] sumValues= {5,4,3,2,1};
        System.out.println(calculateValues(sumValues));
    }
    static int calculateValues(int[] values){
        int sum=0;

        for (int i: values){
            sum+=i;
        }
        return sum;
    }
}
