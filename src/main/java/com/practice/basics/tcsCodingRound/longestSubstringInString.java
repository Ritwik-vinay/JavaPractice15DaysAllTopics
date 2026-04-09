package com.practice.basics.tcsCodingRound;

import java.util.LinkedHashSet;
import java.util.Set;

public class longestSubstringInString {
    public static void main(String[] args) {
        longestSubstring("abcabcbb");
    }

    static int longestSubstring(String str) {
        Set<Character> set = new LinkedHashSet<>();
        int left = 0, maxlen = 0, start = 0;

        for (int right = 0; right <= str.length() - 1; right++) {
            // Shrink window until no duplicate
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            if (right - left + 1 > maxlen) {
                maxlen = right - left + 1;
                start = left;
            }
        }
        System.out.println("Substring : " + str.substring(start, start + maxlen));
        System.out.println("Length    : " + maxlen);
        return maxlen;
    }
}
