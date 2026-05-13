package com.learning.lambdasAndStreams;

@FunctionalInterface
interface AddOperation {
    int getResult(int a, int b);

    default int getSum(int b, int c) {
        return b + calculateResidual(c);
    }
    static int calculateResidual(int d) {
       return d % 2;
    }
}

