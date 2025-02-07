package org.angelkode.operators;

import org.angelkode.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class ApiOptional {
    public static void main(String[] args) {

        //Use of Optional class
        Optional<User> firstUser = Stream.of("PedrO","Lucia")
                .map(User::new)
                .findFirst();

        System.out.println(firstUser.orElse(
                new User("Luis","Lucia")
        ).getName());

        Optional<User> secondUser = Stream.of("PedrO","Lucia")
                .map(User::new)
                .findFirst();

        System.out.println(secondUser.isPresent());
    }
}
