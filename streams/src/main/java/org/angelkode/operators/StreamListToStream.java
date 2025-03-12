package org.angelkode.operators;

import org.angelkode.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListToStream {
    public static void main(String[] args) {

        List<User> myList = new ArrayList<>();

        myList.add(new User("John", "Doe"));
        myList.add(new User("John", "Doe2"));
        myList.add(new User("John", "Doe3"));

        myList.stream()
                .map(user -> user.getSurname().toLowerCase())
                .flatMap(name -> {
                    if(name.contains("doe".toLowerCase())){
                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
