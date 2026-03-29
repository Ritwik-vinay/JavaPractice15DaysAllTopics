package com.practice.basics.tcsCodingRound;

import java.util.Arrays;

public class rearrangeTheDays2 {
    public static void main(String[] args) {
        String[] days={"tuesday","thursday","Sunday","monday"};
        String day = "";
        Arrays.sort(days);
        for (int i=0;i<=days.length-1;i++){
            day= days[i];
            System.out.println(day);
        }

    }
}
