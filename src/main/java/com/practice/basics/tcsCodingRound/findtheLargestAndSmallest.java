package com.practice.basics.tcsCodingRound;

public class findtheLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr= {2,3,6,5,1,4};
        largestNum(arr);
        smallestNum(arr);
    }
    static void largestNum(int[] num){
        int largest= num[0];

        for (int n:num){
            if (n>largest){
                largest=n;
            }
        }
        System.out.println(largest);
    }
    static void smallestNum(int[] num){
        int smallest= num[num.length-1];

        for (int n: num){
            if (n<smallest){
                smallest= n;
            }
        }
        System.out.println(smallest);
    }
}
