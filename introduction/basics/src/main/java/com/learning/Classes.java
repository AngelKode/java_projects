package com.learning;

import java.util.Arrays;

public class Classes {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYearModel(2020);
        Car myCar2 = new Car();
        myCar2.setYearModel(2021);
        Car myCar3 = new Car();
        myCar3.setYearModel(1992);
        
        Car[] myCars = new Car[3];
        myCars[2] = myCar;
        myCars[0] = myCar2;
        myCars[1] = myCar3;

        Arrays.sort(myCars);

        for(Car k : myCars){
            System.out.println(k.getYearModel());
        }

        String myCoffee = Coffee.COLOMBIAN.getToast();

        switch(myCoffee){
            case "low" ->
                System.out.println("Is low");
            case "medium" ->
                System.out.println("Is medium");
        }

        for(Coffee myCoff : Coffee.values()){
            System.out.println(myCoff);
        }
    }
}
