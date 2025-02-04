package org.angelkode.operators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {

        //Basic example
        Stream.of("Kode","Angel","Juan")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Middle operators
        List<Double> myItems = Stream.of(1,2,3,4,5)
                .map(Math::sqrt)//middle
                .peek(System.out::println)//middle
                .map(Math::floor)//middle
                .toList();//final

        System.out.println(myItems);

    }
}
