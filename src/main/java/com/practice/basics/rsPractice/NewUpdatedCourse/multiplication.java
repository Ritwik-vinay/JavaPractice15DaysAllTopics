package com.practice.basics.rsPractice.NewUpdatedCourse;

public class multiplication {
       public static void main(String[] args) {
      multiplicationMethod(5);
        
    }
    static void multiplicationMethod(int number){
        int result=0;
        for(int i=1;i<=10;i++){
            result= result+number;
            System.out.println(result);
        }
       
    }
    
}
