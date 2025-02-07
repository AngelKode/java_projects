package org.angelkode.operators;

import org.angelkode.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamAnyMatch {
    public static void main(String[] args) {
        //Basic use
        boolean isDataAvailable = Stream.of("PedrO","Lucia")
                .map(User::new)
                .anyMatch(user -> user.getId() == 1);

        System.out.println(isDataAvailable);

        //Counting the items
        long userCount = Stream.of("Lola","Juana")
                .map(User::new)
                .count();

        System.out.println(userCount);
    }
}
