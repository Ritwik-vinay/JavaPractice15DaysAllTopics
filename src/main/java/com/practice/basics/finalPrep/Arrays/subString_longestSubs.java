package com.practice.basics.finalPrep.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class subString_longestSubs {
    public static void main(String[] args) {
        String val="abcdabcbbd";
        longSubstring(val);
        
    }
    static int longSubstring(String s){
        Set<Character> set = new LinkedHashSet<>();
        int left=0, maxlen=0, start=0;

        for (int right =0; right<= s.length()-1; right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen= Math.max(maxlen, right-left+1);
            if (maxlen== right-left+1){
                start= left;
            }
        }
        System.out.println("Strings Substring: "+ s.substring(start,start+maxlen));
        System.out.println("Length: "+ maxlen);
        return maxlen;
    }
}
