package com.practice.basics.rsPractice.NewUpdatedCourse;

public class fabonacciSeries {
    public static void main(String[] args) {
        fabonacciSeriesChecker(10);
        
    }
    static void fabonacciSeriesChecker(int n){
        int firstNumber=0;
        int secondNumber=1;

        System.out.println("Fabonacci Series "+ n + " terms:");

        for(int i=1;i<=n;i++){
            System.out.print(firstNumber +", ");
            int nextTerm= firstNumber+ secondNumber;
            firstNumber=secondNumber;
            secondNumber= nextTerm;
        }
        System.out.println();
    }
}
