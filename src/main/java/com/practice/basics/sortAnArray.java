package com.practice.basics;

public class sortAnArray {
    public static void main(String[] args) {
        int [] arr= {4,5,3,2,1,0};
        System.out.println("Original array: " +
                java.util.Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " +
                java.util.Arrays.toString(arr));


    }
    static void bubbleSort(int[] arr){
        int size= arr.length;
        boolean swapped;

        for (int i=0; i<size-1;i++){
            swapped=false;
            for (int j=0; j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
