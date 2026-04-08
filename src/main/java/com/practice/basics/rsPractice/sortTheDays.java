package com.practice.basics.rsPractice;

public class sortTheDays {
    public static void main(String[] args) {
        String[] days= {"tuesday","thursday","monday","sunday"};
        for (int i=0;i<=days.length-1;i++){
            for (int j=0;j< days.length-i-1;j++){
                if (days[j].compareTo(days[j+1])>0){
                    String temp= days[j];
                    days[j]= days[j+1];
                    days[j+1]=temp;
                }
            }
        }
        for (String day: days){
            System.out.println(day);
        }
    }
}
