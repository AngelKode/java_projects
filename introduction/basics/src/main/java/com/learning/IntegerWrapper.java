package com.learning;

public class IntegerWrapper {
    public static void main(String[] args) {
        Integer myInteger = Integer.valueOf(20);
        Integer myInteger2 = 20;
        
        System.out.println(myInteger);
        System.out.println(myInteger2.intValue());
        System.out.println(myInteger.getClass());

        Class<?> myClass = myInteger.getClass();

        System.out.println(myClass.getClasses());
    }
}
