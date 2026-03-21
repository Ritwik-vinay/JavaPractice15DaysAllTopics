package com.practice.basics.oldBasicsJava;

public class countVowelAndConsonant {
    public static void main(String[] args) {
        String word= "ritwik";
        countVowel_Consonant(word);

    }

    static void countVowel_Consonant(String input){
        int vCount =0;
        int cCount =0;

        for (int i=0;i<=input.length()-1;i++){
            char ch= input.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            }
            else {
                cCount++;
            }
        }

        System.out.println("Vowel Count: " + vCount);
        System.out.println("Consonant Count: "+ cCount);
    }
}
