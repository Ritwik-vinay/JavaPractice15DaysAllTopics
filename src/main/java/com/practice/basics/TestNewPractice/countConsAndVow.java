package com.practice.basics.TestNewPractice;

public class countConsAndVow {
    public static void main(String[] args){
        String str="Java Programming";
        consAndVowCountChecker(str);
    }
    static void consAndVowCountChecker(String value){
        value= value.replaceAll("\\s+", "").toLowerCase();
        int cCount=0;
        int vCount=0;

        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='a'||value.charAt(i)=='e'||value.charAt(i)=='i'||value.charAt(i)=='o'||value.charAt(i)=='u'){
                vCount++;
            }
            else{
                cCount++;
            }
        }
        System.out.println(cCount + " is the count of consonant");
        System.out.println(vCount+" is the count of the vowel");
    }
}
