package com.practice.basics.finalPrep.combinedTopicsQuiz;

public class firstAndLastMatcher {
    public static void main(String[] args) {
        String s="madam";
        String s1="radar";
        String s2="Automation";
        fistAndLastCharacterMatcher(s);
        fistAndLastCharacterMatcher(s1);
        fistAndLastCharacterMatcher(s2);
        
    }
    static void fistAndLastCharacterMatcher(String s){
        char[] sChar= s.toCharArray();
        if (sChar[0]== sChar[sChar.length-1]) {
            System.out.println(s);
        }
        else{
            System.out.println(s+ " string character not matching");
        }
    }
    
}
