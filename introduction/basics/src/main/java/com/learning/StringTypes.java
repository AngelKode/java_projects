package com.learning;

public class StringTypes {
    public static void main(String[] args) {
        StringBuilder myStringBuilder = new StringBuilder("Hi, im an string builder");

        myStringBuilder.append(", HI");
        System.out.println(myStringBuilder.toString());
    }
}
