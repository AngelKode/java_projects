package org.angelkode.operations;

public class CalculatorMain {
    public static void main(String[] args) {

        MathOperation sum = Double::sum;
        MathOperation substraction = (a,b) -> a - b;

        Calculator calculator = new Calculator();

        System.out.println(calculator.operation(12.3, 45.5, sum));
        System.out.println(calculator.operation(12.3, 45.5, substraction));

        System.out.println(calculator.operation(1.0,-10, (a,b) -> a * b));

        //Bifunction implementation
        System.out.println(calculator.altOperation(1.0,2.0, Double::min));
        System.out.println(calculator.altOperation(1.0,2.0, Double::max));
    }
}
