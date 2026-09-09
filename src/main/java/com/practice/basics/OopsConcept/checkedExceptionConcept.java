package com.practice.basics.OopsConcept;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedExceptionConcept {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("test.txt")) {
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
