package com.learning;

import java.util.Map;

public class Environment {
    public static void main(String[] args) {
        
        Map<String,String> myEnv = System.getenv();
        
        System.out.println("Environment values: ");
        for(String key : myEnv.keySet()){
            System.out.println(key + " => " + myEnv.get(key));
        }
    }
}
