package org.angelkode.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {

        Function<String, String> functionImp = param -> "Hola " + param;

        System.out.println(functionImp.apply("Angel"));

        //Reference methods
        Function<String, String> functionReference = String::toUpperCase;
        System.out.println(functionReference.apply("angel"));

        Function<Double, Double> squareRoot = Math::sqrt;
        System.out.println(squareRoot.apply(5d));

        //BiFunction
        BiFunction<String, String, String> biFunctionImp = String::concat;
        System.out.println(biFunctionImp.apply("angel", "angel"));

        BiFunction<Double, Double, Boolean> valueDiff = (num1, num2) -> num1.doubleValue() == num2.doubleValue();
        System.out.println(valueDiff.apply(2d, 2d));
    }
}
