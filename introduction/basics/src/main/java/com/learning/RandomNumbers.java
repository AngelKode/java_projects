package com.learning;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //Using random method from Math class
        String[] colorPoll = {"red","blue","green","yellow","orange"};
        double randomNumber = Math.floor(Math.random() * colorPoll.length);

        System.out.println("Selected color: " + colorPoll[(int) randomNumber]);

        //Using Random class
        Random randObject = new Random();
        randObject.setSeed(System.currentTimeMillis());
        System.out.println("Selected color: " + colorPoll[randObject.nextInt(colorPoll.length)]);
    }
}
