package com.learning;

public class WrapperClasses {
    public static void main(String[] args) {
        //The difference when working with wrapper objects and primitive variables is that the wrapper
        //works with instance and primitive with a copy
        //For example:

        //This operation makes that both variables have the same memory address
        Integer myInteger = 100;
        Integer myInteger2 = myInteger;
        System.out.println(myInteger + " " + myInteger2);

        myInteger2 = Integer.valueOf(100);

        //Even if they have the same value, == operation compares instance
        System.out.println(myInteger == myInteger2);


        int myInt1 = 100;
        int myInt2 = myInt1;

        System.out.println(myInt1 + " " + myInt2);
        myInt2 = 3;

        //And with primitive data it compares value rather than instance
        System.out.println(myInt1 == myInt2);
    }
}
