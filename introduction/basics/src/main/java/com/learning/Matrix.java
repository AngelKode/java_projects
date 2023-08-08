package com.learning;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        
        int[][] myMatrix = new int[2][4];
        System.out.println(myMatrix.length);

        int[][] variableColumns = new int[2][];

        variableColumns[0] = new int[12];
        variableColumns[1] = new int[6];

        Arrays.fill(variableColumns[0],1);
        Arrays.fill(variableColumns[1],2);

        for(int arr[] : variableColumns){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
}
