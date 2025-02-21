package org.angelkode.operators;

import org.angelkode.models.User;

import java.awt.*;
import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMultipleOperators {
    public static void main(String[] args) throws AWTException, IOException {

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

        //Working with double and int stream
        DoubleStream gradeRange = DoubleStream.of(0,1,2,3,4,5);

        double squareSum = gradeRange.reduce(0,(acc, value) -> {
            return acc + Math.pow(value,2);
        });

        System.out.println(squareSum);
        //
        IntStream numberSum = IntStream.rangeClosed(0,10);
        OptionalInt maxNum = numberSum.max();
        maxNum.ifPresent(System.out::println);

        //Statistics
        IntStream randomNumbers = IntStream.rangeClosed(0,10);
        IntSummaryStatistics summaryStatistics = randomNumbers.summaryStatistics();

        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getMin());

        //Map with int
        IntStream charCount = Stream.of("Hola","Como","Estas   ")
                .map(String::trim)
                .mapToInt(String::length);

        IntSummaryStatistics charCountStatistic = charCount.summaryStatistics();
        System.out.println(charCountStatistic.getAverage());
        System.out.println(charCountStatistic.getMin());

        //Flatmap
        Stream<User> names = Stream.of("Juan","Pedro")
                .map(User::new)
                .flatMap(user -> {
                    if(user.getName().equals("Juan")){
                        return Stream.of(user);
                    }
                    return Stream.empty();
                });
        names.forEach(user -> System.out.println(user.getName()));
    }
}
