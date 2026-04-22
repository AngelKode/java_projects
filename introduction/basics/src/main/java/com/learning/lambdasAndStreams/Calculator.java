package com.learning.lambdasAndStreams;

public class Calculator implements AddOperation{

    @Override
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
