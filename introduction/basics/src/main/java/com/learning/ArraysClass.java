package com.learning;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        
        String[] myStrings = {"Coca", "Sprite", "Seven" , "Pepsi"};
        
        System.out.println(myStrings);

        Arrays.sort(myStrings);

        for(String data : myStrings){
            System.out.println(data);
        }

        // Ask user the numbers to enter and print the bigger.
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How many numbers want to enter?: ");
        int numberCount = myScanner.nextInt();
        int[] myArray = new int[numberCount];

        for(int index=0 ; index < numberCount ; index++){
            System.out.print("Enter the number: ");
            myArray[index] = myScanner.nextInt();
        }

        Arrays.sort(myArray);
        System.out.print("The biggest number is: ");
        System.out.println(myArray[myArray.length - 1]);
        myScanner.close();

        // Change size of the array
        int[] newArrayFromOriginal = Arrays.copyOf(myArray, myArray.length + 1);
        System.out.println("A: ");
        for(int n : myArray){
            System.out.println(n);
        }
        System.out.println("B:");
        for(int n : newArrayFromOriginal){
            System.out.println(n);
        }
    }
}
