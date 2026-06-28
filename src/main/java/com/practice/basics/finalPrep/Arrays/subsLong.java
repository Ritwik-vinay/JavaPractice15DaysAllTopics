package com.practice.basics.finalPrep.Arrays;

import java.util.*;

public class subsLong {
    public static void main(String[] args) {
        String var ="abcdabcbbd";
        subs(var);
    }
    static int subs(String s){
        Set<Character> set = new LinkedHashSet<>();
        int maxlen=0,left=0,start=0;
        for (int right = 0; right < s.length()-1; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen= Math.max(maxlen, right-left+1);
            if (maxlen== right-left+1) {
                start= left;
            }
        }
        System.out.println("Values: "+ s.substring(start,start+maxlen));
        System.out.println("length "+ maxlen);
        return maxlen;

    }
    
}
