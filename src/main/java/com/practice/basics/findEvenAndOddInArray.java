package com.practice.basics;

import java.util.ArrayList;

public class findEvenAndOddInArray {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findEvenAndOdd(arr);
    }

    static void findEvenAndOdd(int[] arr){
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        for (int a: arr){
            if (a%2==0){
               even.add(a);
            }
            else{
                odd.add(a);
            }
        }
        System.out.println(even + " :Even Number in Array");
        System.out.println(odd + " : Odd Numbers in array");
    }
}
