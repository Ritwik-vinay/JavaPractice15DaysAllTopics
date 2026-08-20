package com.practice.basics.rsPractice.NewUpdatedCourse;

public class fabonacciSeries2 {
    public static void main(String[] args) {
        fabSeries(10);
    }
    static void fabSeries(int n){
        int a =0;
        int b=1;
        int sum=0;
        int i=1;
        while (i<n) {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            i++;
            
        }
    }
    
}
