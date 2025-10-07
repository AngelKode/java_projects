package com.thread;

public class ExampleThread extends Thread{

    public ExampleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running Thread " + this.getName());
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}
