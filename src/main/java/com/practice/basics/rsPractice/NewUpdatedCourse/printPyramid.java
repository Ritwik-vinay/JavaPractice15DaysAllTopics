package com.practice.basics.rsPractice.NewUpdatedCourse;

public class printPyramid {
    public static void main(String[] args) {
        rightAnglePyramid(5);
        revRightAngletriangle(5);
    }
    static void rightAnglePyramid(int n){
        for(int i=0;i<=n-1;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(88888888);
    }
    static void revRightAngletriangle(int n){
        for(int i =n;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
