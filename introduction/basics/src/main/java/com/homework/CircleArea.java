package com.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        double circleRadius, circleArea;

        System.out.print("Enter the radius of the circle: ");

        try {
            circleRadius = userEntry.nextDouble();
            circleArea = Math.PI * Math.pow(circleRadius, 2);

            System.out.println("Given " + circleRadius + " radius, area is " + circleArea);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }
    }
}
