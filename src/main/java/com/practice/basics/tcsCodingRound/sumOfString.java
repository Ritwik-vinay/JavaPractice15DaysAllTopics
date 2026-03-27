package com.practice.basics.tcsCodingRound;

public class sumOfString {
    public static void main(String[] args) {
        String[] num={"1","2","3"};
        int numb = 0;
        for (String n: num){
            numb+= Integer.parseInt(n);
        }

        System.out.println(numb);
    }
}
