package com.learning;

public class Classes {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.toString());

        String myCoffee = Coffee.COLOMBIAN.getToast();
        
        switch(myCoffee){
            case "low" ->
                System.out.println("Is low");
            case "medium" ->
                System.out.println("Is medium");
        }
    }
}
