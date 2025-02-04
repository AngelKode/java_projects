package org.angelkode.operators;

import org.angelkode.models.User;

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

        //-----------------------------------

        //Creating Users from a list of strings
        Stream<User> newUsers = Stream.of("Juan Lopez","Carlos Vallarta")
                .map(String::toUpperCase)
                .map(name -> {
                    String nameNew = name.split(" ")[0];
                    String surnameNew = name.split(" ")[1];

                    return new User(nameNew,surnameNew);
                });

        List<String> userData = newUsers
                .map(User::getName)
                .toList();

        userData.forEach(System.out::println);
    }
}
