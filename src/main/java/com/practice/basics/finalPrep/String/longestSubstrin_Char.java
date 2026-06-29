package com.practice.basics.finalPrep.String;

import java.util.*;

public class longestSubstrin_Char {
    public static void main(String[] args) {
        String str = "abcabcddd";
        longestSubs(str);

    }
    static int longestSubs(String str) {
        Set<Character> set = new LinkedHashSet<>();
        int maxlen = 0, start = 0, left = 0;

        for (int right = 0; right <= str.length() - 1; right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
          maxlen = Math.max(maxlen, right - left + 1);
            if ( maxlen==right - left + 1) {
               // maxlen = right - left + 1;
                start = left;

            }
        }
        System.out.println("Subs: " + str.substring(start, start + maxlen));
        System.out.println("length: " + maxlen);
        return maxlen;
    }
}
