package com.practice.basics.rsPractice.NewUpdatedCourse;

public class sortTheArrayInASCDesc {
    public static void main(String[] args) {
        int[] ab={2,4,6,8,1,0};
        sortArrayDesc(ab);
        sortTheArrayInASC(ab);
    }
    static void sortArrayDesc(int[] a){
        int result=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if (a[j]<a[j+1]) {
                    int temp= a[j+1];
                    a[j+1]= a[i];
                    a[i]=temp;
                }

            }
        }
        for(int values: a){
            System.out.println(values);
        }
        System.out.println("***************");
    }
    
    static void sortTheArrayInASC(int [] a){
       
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int values: a){
            System.out.println(values);
        }
    }
    
}
