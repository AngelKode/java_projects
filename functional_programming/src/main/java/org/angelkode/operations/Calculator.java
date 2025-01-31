package org.angelkode.operations;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Calculator {

    public double operation(double a, double b, MathOperation lambda){
        return lambda.runOperation(a,b);
    }

    public double altOperation(double a, double b, BiFunction<Double, Double , Double> lambda){
        return lambda.apply(a,b);
    }
}
