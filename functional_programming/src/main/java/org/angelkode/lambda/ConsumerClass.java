package org.angelkode.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hi");

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("I'm " + name + ", " + age + " years old");
        };
        biConsumer.accept("Angel", 20);

        //------------------------------------

        Consumer<List<Double>> avgUtils = list -> {
          AtomicReference<Double> correctValues = new AtomicReference<>( 0D);

          list.stream()
                  .filter(a -> {
                      if (a > 0){
                          correctValues.set(correctValues.get() + 1);
                      }
                      return a > 0;
                  })
                  .reduce(Double::sum)
                  .ifPresent(total -> System.out.println(total / correctValues.get()));
        };

        ArrayList<Double> myArrayList = new ArrayList<>();
        myArrayList.add(1.0);
        myArrayList.add(2.0);
        myArrayList.add(-3.0);
        avgUtils.accept(myArrayList);

        //Method references
        Consumer<String> printData = System.out::println;
        List<String> myList = Arrays.asList("Me","You");
        myList.forEach(printData);

        BiConsumer<ModelExample, Integer> setAge = ModelExample::setAge;
        ModelExample modelOne = new ModelExample();

        setAge.accept(modelOne, 25);
        System.out.println(modelOne.getAge());
    }
}
