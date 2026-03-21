package com.practice.basics.oldBasicsJava;

public class primeNumberChecker {
    public static void main(String[] args) {
        primeNumChecker(17);
        primeNumChecker(6);
    }


    static void primeNumChecker(int n){
        boolean isPrime=true;
        if (n<=1){
            isPrime=false;
        }else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(n + " isPrime: " + isPrime);
    }
}
