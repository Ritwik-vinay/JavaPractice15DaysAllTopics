package com.javaPractice.tests;

public class countVowel {
    public static void main(String[] args){
        String value= "Ritwik vinay";
        countOfVowel_Cons(value);
    }
    static void countOfVowel_Cons(String value){
        value= value.replaceAll("//s+", "").toLowerCase();
        int consCount=0;
        int vowCount=0;
        for(int i=0; i<value.length()-1;i++){
            if(value.charAt(i)=='a' ||value.charAt(i)=='e' ||value.charAt(i)=='i' ||
        value.charAt(i)=='o' ||value.charAt(i)=='u'){
            vowCount++;
        }
        else{
            consCount++;

        }
        }
        System.out.println("Vowel Count-> " + vowCount);
        System.out.println("Consonant Count -> "+ consCount);
    }
    
}
