package com.practice.basics.tcsCodingRound;

public class digitChecker {
    public static void main(String[] args) {
        String s= "imp0rtan7";
        String s2="important";
        char[] ch= s.toCharArray();
        char[] ch2= s2.toCharArray();
        boolean isdigit = false;
       for (char c: ch){
           if (Character.isDigit(c)){
               isdigit=true;
               //System.out.print(c + " , ");
           }
           else {
               isdigit=false;
           }
       }
        System.out.println(isdigit + " = "+ s);
        for (char c2: ch2){
            if (Character.isDigit(c2)){
                isdigit=true;
                //System.out.print(c + " , ");
            }
            else {
                isdigit=false;
            }
        }
        System.out.println(isdigit + " = " + s2);
    }
}
