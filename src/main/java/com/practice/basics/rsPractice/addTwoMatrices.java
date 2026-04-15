package com.practice.basics.rsPractice;

public class addTwoMatrices {
    public static void main(String[] args) {
       // Matrix A
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        // Matrix B
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        int rows= A.length;
        int cols= A[0].length;
        int[][] result= new int[rows][cols];

        for (int i=0; i<rows;i++){
            for (int j=0; j<cols;j++){
                result[i][j]=A[i][j] + B[i][j];
            }
        }
        System.out.println("Result Matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
