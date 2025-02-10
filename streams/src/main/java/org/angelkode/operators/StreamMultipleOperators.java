package org.angelkode.operators;

import org.angelkode.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMultipleOperators {
    public static void main(String[] args) {

        //Filter
        long myUsers = Stream.of("PedrO","Lucia","","")
                .filter(String::isEmpty)
                .count();

        System.out.println(myUsers);

        //Distinct
        Stream<String> unicNames = Stream.of("PedrO","Lucia","","Lucia")
                .distinct();

        unicNames.forEach(System.out::println);

        //Reduce
        Optional<Integer> totalGrade = Stream
                .of(1,2,3,4,5,6,7,8,9,10)
                .reduce(Integer::sum);

        totalGrade.ifPresentOrElse(System.out::println, () -> System.out.println("No grade present"));


    }
}
