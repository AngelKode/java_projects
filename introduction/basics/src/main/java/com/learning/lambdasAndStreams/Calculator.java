package com.learning.lambdasAndStreams;

public class Calculator{
    public static void main(String[] args) {
        AddOperation addTwoStringsLength = Integer::sum;
        int s = addTwoStringsLength.getResult(2,3);
    }
}
