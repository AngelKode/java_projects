package com.learning;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        // Create the class to read
        Scanner myScanner = new Scanner(System.in, "UTF-8");

        try {
            // Ask the user
            System.out.println("Enter the number: ");

            int enterNumber = myScanner.nextInt();
            System.out.println("You enter: " + enterNumber);
            myScanner.close();
        } catch (Exception e) {
            System.out.println("ENTER A VALID NUMBER\n");
            main(args);
        }
    }
}