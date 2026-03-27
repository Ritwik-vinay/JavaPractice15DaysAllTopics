package com.practice.basics.OopsConcept;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedExceptionConcept {
    public static void main(String[] args) {
        //Checked Exception Concept
        try{
            FileReader file= new FileReader("test.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Fiel not Found");
        }
    }
}
