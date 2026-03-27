package com.practice.basics.OopsConcept;

public class overLoadingConcpet {
    public static void main(String[] args) {
        System.out.println(sumOfValues(13.5,99.2));
        System.out.println( sumOfValues(2,5,9));
        System.out.println(sumOfValues(5,1,9,5));
    }
    static int sumOfValues(int a, int b, int c, int d){
        return a+b+c+d;
    }
    static int sumOfValues(int a,int b, int c){
        return a+b+c;
    }
    static double sumOfValues(double a ,double b){
        return a+b;
    }
}
