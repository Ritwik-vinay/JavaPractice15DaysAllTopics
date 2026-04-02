package com.practice.basics.rsPractice;

public class swapTwoString {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2= "Shetty";
        System.out.println("Befor Swapping");
        System.out.println(s1 );
        System.out.println(s2);
        String temp = s1;
        s1=s2;
        s2=temp;

        System.out.println("After Swapping");
        System.out.println(s1 );
        System.out.println(s2);


    }
}
