package com.practice.basics.rsPractice.NewUpdatedCourse;

public class method_StoresArrayAndSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println("Sum of all the Arrays are:-> "+ sumOfArray(arr));
    }
    static int sumOfArray(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
}
    
