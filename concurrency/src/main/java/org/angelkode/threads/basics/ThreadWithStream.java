package org.angelkode.threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class ThreadWithStream {
    public static void main(String[] args) {

        Stream<String> threadNames = Stream.of("Thread-1", "Thread-2","Thread-3");

        ExecutorService executor = Executors.newCachedThreadPool();

        threadNames.map(FoodThread::new).forEach(executor::execute);

        executor.close();
    }
}
