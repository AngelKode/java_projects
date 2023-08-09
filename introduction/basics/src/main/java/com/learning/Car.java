package com.learning;

import lombok.Data;

/**
* @param modelName the model of the car 
*/
public @Data class Car implements Comparable{
    private String modelName;
    private int yearModel;


    @Override
    public String toString(){
        return modelName + " " + yearModel;
    }


    @Override
    public int compareTo(Object o) {
        Car myOtherCar = (Car) o;

        if(myOtherCar.getYearModel() == this.yearModel){
            return 0;
        }else if(myOtherCar.getYearModel() < this.yearModel){
            return 1;
        }
        return -1;
    }
}

