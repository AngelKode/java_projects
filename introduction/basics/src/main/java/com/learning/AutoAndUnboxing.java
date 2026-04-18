package com.learning;

public class AutoAndUnboxing {
    public static void main(String[] args) {
        //When converting a primitive value to its Wrapper corresponding class its AUTOBOXING
        //For example: int to Integer, double to Double, etc
        Integer wrapperIntObject = 5;
        Character wrapperCharObject = 'C';

        //And we do it the other way it's called UNBOXING, when the object is passed a Parameter that expects
        //its primitive type or assigning to a variable with the primitive type.
        //For example:
        int myPrimitiveValue = Integer.valueOf(5);
        unboxingVariableExample(Integer.valueOf(5));
    }
    private static void unboxingVariableExample(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("You are " + age + " years old!");
    }
}
