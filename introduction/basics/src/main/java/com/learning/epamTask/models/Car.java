package com.learning.epamTask.models;

public abstract class Car{
    private final String licensePlate;
    protected int distanceDriven;
    protected Model model;

    public Car(String licensePlate, Model model) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public abstract void drive(int distance);

    public abstract int getDistanceDriven();
}
