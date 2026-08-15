package com.practice.basics.rsPractice.NewUpdatedCourse;

public class swapWithAndWithoutTemp {
    public static void main(String[] args) {
        swapNumberWithoutTemp(3, 10);
        swapNumberWithTemp(5, 3);

    }

    static void swapNumberWithoutTemp(int a, int b) {
        // if a=10 and b=20 a= a+b; a=30 b= a-b; a= a-b;
        System.out.println("Before Swapping (without temp) " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping (without temp) " + a + " " + b);
    }

    static void swapNumberWithTemp(int a, int b) {
        System.out.println("Before Swapping (with temp) " + a + " " + b);
        int temp = a;// temp=10;
        a = b;// a=20
        b = temp;// b=10
        System.out.println("After Swapping (with temp) " + a + " " + b);

    }

}
