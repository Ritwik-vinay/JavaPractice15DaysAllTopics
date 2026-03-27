package com.practice.basics.OopsConcept;

public class ElementNotFoundException extends Exception{
    // Constructor 1: with message
    public ElementNotFoundException(String message){
        super(message);
    }
    // Constructor 1: with message and clause
    public ElementNotFoundException(String message, Throwable clause){
        super(message,clause);
    }
}
