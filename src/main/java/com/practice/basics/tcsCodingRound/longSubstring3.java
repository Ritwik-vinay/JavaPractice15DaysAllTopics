package com.practice.basics.tcsCodingRound;

import java.util.LinkedHashSet;
import java.util.Set;

public class longSubstring3 {
    public static void main(String[] args) {
        longSubs("abcabcbb");

    }
    static void longSubs(String s){
        int left=0,maxlen=0,start=0;
        Set<Character> set = new LinkedHashSet<>();

        for (int right=0; right<=s.length()-1;right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right-left+1>maxlen){
                maxlen= right-left+1;
                start=left;
            }
        }
        System.out.println("Substring: "+ s.substring(start,start+maxlen));
        System.out.println("Count "+ maxlen);
    }
}
