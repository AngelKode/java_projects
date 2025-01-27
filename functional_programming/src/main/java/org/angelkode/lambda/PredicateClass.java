package org.angelkode.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {

        //Basic
        Predicate<Integer> testing = num -> num > 4;
        System.out.println(testing.test(5));

        Predicate<String> userPrivileges = role -> role.equals("ADMIN");
        System.out.println(userPrivileges.test("ADMIN"));

        //Function Reference
        BiPredicate<String, String> osComparing = String::equalsIgnoreCase;
        System.out.println(osComparing.test("x64", "X64"));

        BiPredicate<Integer, String> valueCompare = (number, text) -> {
            return number == Integer.parseInt(text);
        };
        System.out.println(valueCompare.test(5,"5"));
    }
}

