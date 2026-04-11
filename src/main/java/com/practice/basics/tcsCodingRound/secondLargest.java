package com.practice.basics.tcsCodingRound;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,8,0,7,6,5};
        secLargestNum(arr);

    }
    static void secLargestNum(int[] arr){
        int largest= arr[0];
        int secLargest= arr[arr[0]-1];

        for (int n: arr){
            if (n>largest){
                secLargest=largest;
                largest=n;
            } else if (n>secLargest && n<largest) {
                secLargest=n;
            }
        }
        System.out.println(secLargest);
    }
}
