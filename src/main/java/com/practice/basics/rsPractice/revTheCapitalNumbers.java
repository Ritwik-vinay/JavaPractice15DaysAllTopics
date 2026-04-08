package com.practice.basics.rsPractice;

import java.util.function.Predicate;

public class revTheCapitalNumbers {
    public static void main(String[] args) {
        //2rtu3uiy4yy1
        //DrtuCuiyByyA
        String input= "4rtu3uiy2yy1";
        String input2= "DrtuCuiyByyA";
        System.out.println(characterCheckerRev(input, Character::isDigit));
        System.out.println(characterCheckerRev(input2,Character::isUpperCase));
    }

    public static String characterCheckerRev(String str, Predicate<Character> condition) {
        char[]  arr = str.toCharArray();
       int left=0;
       int right= arr.length-1;

       while (left< right){
           if (!condition.test(arr[left])){
               left++;
           }else if (!condition.test(arr[right])){
               right--;
           }else{
               char temp= arr[left];
               arr[left]= arr[right];
               arr[right]=temp;
               left++;
               right--;
           }
       }
       return new String(arr);
    }
}
