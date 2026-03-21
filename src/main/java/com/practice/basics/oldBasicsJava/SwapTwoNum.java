package com.practice.basics.oldBasicsJava;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a= 10 ,b=20;

      swapTwoNumWithThirdVariable(a,b);
        System.out.println("************");
        swapTwoNumberWithoutThirdVariable(a,b);
    }

    static void swapTwoNumWithThirdVariable(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    static void swapTwoNumberWithoutThirdVariable(int a, int b){
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
