package com.practice.basics.TestNewPractice;

import java.util.Arrays;

public class anagramCode {
    public static void main(String[] args){
        String a="silent";
        String b = "listen";
        System.out.println(anagramChecker(a, b));
    }
    static boolean anagramChecker(String a, String b){
        a= a.replaceAll("\\s+", "").toLowerCase();
        b= b.replaceAll("\\s+", "").toLowerCase();
        if(a.length()!= b.length()){
            return false;
        }
        char[] c= a.toCharArray();
        char[] d= b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<=c.length-1;i++){
            if(c[i]!= d[i]){
                return false;
            }
        }
        return true;
    }

}
