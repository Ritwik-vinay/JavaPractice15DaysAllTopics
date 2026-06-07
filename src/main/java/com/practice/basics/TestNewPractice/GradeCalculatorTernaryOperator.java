package com.practice.basics.TestNewPractice;

import java.util.Scanner;

public class GradeCalculatorTernaryOperator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int marks = scn.nextInt();

        String Grade= (marks>=90 && marks<=100)? "A":
                      (marks>=80 && marks<=89)? "B":
                      (marks>=70 && marks<= 79)? "C":
                      (marks>=60 && marks<= 69)? "D":
                      (marks>=50 && marks<= 59)? "E":
                      (marks>=40 && marks<=49)? "F": "Invalid Input";

        System.out.println(Grade);              
    }
    
}
