package com.learning.lambdasAndStreams;

@FunctionalInterface
interface AddOperation {
    int addTwoNumbers(int a, int b);

    default int getSum(int b, int c) {
        return b + calculateResidual(c);
    }
    static int calculateResidual(int d) {
       return d % 2;
    }
}

