package org.angelkode.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Basics {
    public static void main(String[] args) {
        //Creating basic stream variable
        Stream<Integer> sizes = Stream.of(1,2,3,4,5,25,40,-30-1);
        sizes.forEach(System.out::println);

        //Creating from array object
        Double[] currentGrades = {5.0,6.0,5.0,3.0,9.0,10.0};
        Stream<Double> gradesStream = Arrays.stream(currentGrades);
        gradesStream.forEach(System.out::println);

        //Using Stream builder
        Stream<String> emails = Stream.<String>builder()
                .add("email@ejemplo.com")
                .build();
        emails.forEach(System.out::println);

        //From Collection class
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);

        myList.stream().forEach(System.out::println);


    }
}
