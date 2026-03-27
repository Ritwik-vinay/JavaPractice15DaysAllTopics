package com.practice.basics.tcsCodingRound;

import java.util.ArrayList;

public class revtheArray4 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(9);
        al.add(8);
        al.add(7);
        al.add(6);
        al.add(5);
        int start=0;
        int end = al.size()-1;
        while (start<end){
            int temp= al.get(start);
            al.set(start,al.get(end));
            al.set(end , temp);
            start++;
            end--;
        }
        System.out.println(al);
    }
}
