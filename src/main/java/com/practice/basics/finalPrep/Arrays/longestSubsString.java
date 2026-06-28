package com.practice.basics.finalPrep.Arrays;

import java.util.*;

public class longestSubsString {
    public static void main(String[] args) {
        String var = "abcdabcbbd";
        longSubsString(var);

    }

    static int longSubsString(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int left = 0, maxlen = 0, start = 0;
        for (int right = 0; right <= s.length() - 1; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
            if (maxlen == right - left + 1) {
                start = left;
            }
        }
        System.out.println("Longest substring " + s.substring(start, start + maxlen));
        System.out.println("length " + maxlen);
        return maxlen;
    }
}
