package com.practice.basics.OopsConcept;

public class ExceptionVsError {
    public static void main(String[] args) {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null, so no exception is thrown.");
        }

        try {
            causeError();
        } catch (StackOverflowError e) {
            System.out.println("caught Error " + e);
        }
    }

    static void causeError() {
        causeError();
    }
}
