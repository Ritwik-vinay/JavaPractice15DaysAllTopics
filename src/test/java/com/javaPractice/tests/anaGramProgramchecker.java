package com.javaPractice.tests;

import java.util.Arrays;

public class anaGramProgramchecker {
    public static void main(String[] args){
        String a= "ritwik";
        String b = "ritesh";
        System.out.println(anagramCheckerCode(a, b));

        String a1= "silent";
        String b1 = "listen";
        System.out.println(anagramCheckerCode(a1, b1));
    }
    static boolean anagramCheckerCode(String a, String b){
          int n1= a.length();
          int n2= b.length();
          if(n1!= n2){
            return false;
          } 
          char[] a1= a.toCharArray();
          char[] b1= b.toCharArray();
          Arrays.sort(a1);
          Arrays.sort(b1);
          
          return Arrays.equals(a1, b1);
        }
    }
    

