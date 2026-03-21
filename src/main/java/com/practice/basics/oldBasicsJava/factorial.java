package com.practice.basics.oldBasicsJava;

public class factorial {
    public static void main(String[] args) {
        factorialChecker(5);
    }


    static void factorialChecker(int a){
        int fact=1;

        for (int i=1; i<=a;i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
