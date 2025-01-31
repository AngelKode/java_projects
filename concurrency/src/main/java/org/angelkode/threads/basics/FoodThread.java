package org.angelkode.threads.basics;

import java.util.stream.Stream;

public class FoodThread extends Thread {
    FoodThread(String name) {
        super(name);
    }

    public void run() {
        //Init process execution
        System.out.println(super.getName() + " starting");
        Stream.of(1,2,3,4,5).forEach(num -> {
            try {
                Thread.sleep(300);
                System.out.println(num);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(super.getName() + " ending");
    }
}
