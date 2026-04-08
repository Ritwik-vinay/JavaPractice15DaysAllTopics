package com.practice.basics.rsPractice;

import java.util.function.Predicate;

public class characterSwapping2 {
    public static void main(String[] args) {
        String str= "aerw23fsd";
        String str2= "asAWSsdfdD";
        System.out.println(revTheSpecificValue(str, Character::isDigit));
        System.out.println(revTheSpecificValue(str2, Character:: isUpperCase));

    }
    public static String revTheSpecificValue(String str, Predicate<Character> condition)
    {
        char[] ch = str.toCharArray();
        int left=0,right= ch.length-1;

        while (left<right){
            if (!condition.test(ch[left])){
                left++;
            }
            else if (!condition.test(ch[right])){
                right--;
            }else{
                char temp= ch[left];
                ch[left]= ch[right];
                ch[right]= temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}
