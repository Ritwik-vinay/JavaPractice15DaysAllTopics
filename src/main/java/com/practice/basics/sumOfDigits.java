package com.practice.basics;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit(123));
        System.out.println(sumDigit(12345));
    }

    static int sumDigit( int num){
        int sum=0;
        int rev=0;

        while (num>0){
            sum+= num%10;
            num/=10;
        }
        return sum;
    }
}
