package com.thread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunnableClass());
        thread.start();


        Thread myThread = new ExampleThread("T1");
        myThread.start();
        System.out.println(myThread.getState());
    }
}
