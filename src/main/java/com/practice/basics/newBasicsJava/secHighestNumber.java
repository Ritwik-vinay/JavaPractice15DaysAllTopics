package com.practice.basics.newBasicsJava;

public class secHighestNumber {
    public static void main(String[] args) {
        int[] num={3,4,5,7,6,2,1};
        secHighestNumber(num);
    }
    static void secHighestNumber(int[] number){
        int max= number[0];
        int secmax= number[number[0]-1];

        for (int i: number){
            if (max<i){
                secmax= max;
                max=i;
            } else if (i>secmax && i<max) {
                secmax=i;

            }
        }
        System.out.println(secmax);
    }
}
