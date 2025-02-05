package org.angelkode.operators;

import org.angelkode.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        //Basic
        Stream<User> myUsers = Stream.of("PedrO","Lucia")
                .map(User::new)
                .filter(user -> user.getName().equalsIgnoreCase("Pedro"));

        List<String> filteredUsers = myUsers
                .map(User::getName)
                .toList();

        filteredUsers.forEach(System.out::println);


        //Return only 1
        Optional<User> firstCoincidence = Stream.of("PedrO","Lucia")
                .map(User::new)
                .filter(user -> user.getId() == 3)
                .findFirst();

        firstCoincidence.ifPresentOrElse(
                user -> System.out.println("First Coincidence: " + user.getName()),
                () -> {
                    System.out.println("Nothing founded.");
                });

    }
}
