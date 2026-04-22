package com.learning.epamTask.models;

import java.util.Comparator;

public class Model implements Comparable<Model>{
    private String manufacturer;
    private String modelName;
    private int power;

    public Model(String manufacturer, String modelName, int power) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.power = power;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getModelName() {
        return this.modelName;
    }
    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return this.getClass() + "{manufacturer='" + this.getManufacturer() + "', modelName='" + this.getModelName() + "', power=" + this.getPower() + "'}" ;
    }

    @Override
    public int compareTo(Model other) {
        Comparator<String> comparator = Comparator.naturalOrder();
        int comparisonResult = comparator.compare(other.getManufacturer(),this.getManufacturer());

        if(comparisonResult == 0) {
            comparisonResult = comparator.compare(other.getModelName(),this.getModelName());
        }
        return comparisonResult;
    }
}
