package com.learning;

import lombok.Data;

/**
* @param modelName the model of the car 
*/
public @Data class Car implements Comparable<Car>{
    private String modelName;
    private int yearModel;

    @Override
    public String toString(){
        return modelName + " " + yearModel;
    }
    
    @Override
    public int compareTo(Car o) {
        Car myOtherCar = (Car) o;

        if(myOtherCar.getYearModel() > this.yearModel){
            return -1;
        }else if(myOtherCar.getYearModel() < this.yearModel){
            return 1;
        }
        return 0;
    }
}

