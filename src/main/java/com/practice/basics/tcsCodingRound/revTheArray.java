package com.practice.basics.tcsCodingRound;

import java.util.ArrayList;

public class revTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        int start=0;
        int end=arrayList.size()-1;

        while (start<end){
            int temp= arrayList.get(start);
            arrayList.set(start,arrayList.get(end));
            arrayList.set(end, temp);

            start++;
            end--;
        }
        System.out.println(arrayList);

    }
}
