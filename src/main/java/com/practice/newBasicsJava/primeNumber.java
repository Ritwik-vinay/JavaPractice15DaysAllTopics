package com.practice.newBasicsJava;

public class primeNumber {
    public static void main(String[] args) {
        primeNumberCheck(17);
        primeNumberCheck(6);
    }

    static void primeNumberCheck(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + " is the prime number=  " + isPrime);

    }

}
