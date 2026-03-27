package com.practice.basics.OopsConcept;

public class ExceptionVsError {
    public static void main(String[] args) {
        try {
            String str= null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("handling Exception "+ e);
        }
        try {
            causeError();
        }catch (StackOverflowError e){
            System.out.println(" caught Error " + e);
        }
    }
    static void causeError(){
        causeError();
    }
}
