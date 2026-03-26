package com.practice.basics.tcsCodingRound;

public class secLargestNumberFromArray {
    public static void main(String[] args) {
        int[] num= {2,3,4,1, 20,15,12,18,30};
        secLargestNumber(num);
    }
    static void secLargestNumber(int[] num) {
        int largest=num[0];
        int secLargest= num[num.length-1];
        for (int n: num){
            if (n>largest){
                secLargest=largest;
                largest=n;
            } else if (secLargest>n && n<largest) {
                secLargest=n;
            }
        }
        System.out.println(largest + " largest number");
        System.out.println(secLargest + " secoundLargest num");
    }
}
