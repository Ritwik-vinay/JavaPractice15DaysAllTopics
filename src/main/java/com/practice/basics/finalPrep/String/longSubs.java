package com.practice.basics.finalPrep.String;

import java.util.*;

public class longSubs {
    public static void main(String[] args) {
        String s="abccdedd";
        longSubstring(s);
        
    }
    static void longSubstring(String s){
        Set<Character> set= new LinkedHashSet<>();
        int maxlen=0,start=0,left=0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen= Math.max(maxlen, right-left+1);
            if (maxlen== right+left-1) {
                start=left;
            }
        }
        System.out.println("Substring : "+ s.substring(start,start+maxlen));
        System.out.println("length = "+ maxlen);
        //return maxlen;

    }
    
}
