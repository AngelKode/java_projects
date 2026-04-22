package com.learning.epamTask.models;

public class ElectricCar extends Car {
    private  int batteryLevel;

    public ElectricCar(String licensePlate, ElectricModel model, int batteryLevel){
        super(licensePlate, model);
        this.batteryLevel = batteryLevel;
    }

    public ElectricModel getElectricModel(){
        return (ElectricModel) this.model;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }

    @Override
    public int getDistanceDriven(){
        return distanceDriven;
    }

    public void setDistanceDriven(int distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    public int charge(int amount){
        if(amount + this.batteryLevel < 0){
            throw new IllegalArgumentException("Battery level cant be negative");
        }

        if(amount + this.batteryLevel > 100){
            return this.batteryLevel = 100;
        }

        return this.batteryLevel + amount;
    }

    @Override
    public void drive(int distance){
        double energyConsumptionPerKilometer = (double) this.getElectricModel().getEnergyConsumption() / 100;
        double totalEnergyConsumption = energyConsumptionPerKilometer * distance;

        if(this.batteryLevel - (int) Math.round(totalEnergyConsumption) < 0){
            throw new IllegalStateException("Cant drive " + distance + " kilometers. Not enough energy.\nCurrent battery: [" + this.batteryLevel + "kWh]\nNeeded energy: [" + (int)totalEnergyConsumption + "kWh]");
        }
        this.setDistanceDriven(this.getDistanceDriven() + distance);
        this.batteryLevel -= (int) Math.round(totalEnergyConsumption);

        System.out.println(
                "Driving for " + distance + "km" + "\n"
                        + "Odometer: " + this.getDistanceDriven() + "\n"
                        + "Consumption: " + totalEnergyConsumption + "\n"
                        + "Battery level: " + batteryLevel + "\n"
        );
    }
}
