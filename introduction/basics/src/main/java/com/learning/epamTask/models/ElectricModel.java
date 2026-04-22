package com.learning.epamTask.models;

public class ElectricModel extends Model {
    private int batteryCapacity;
    private int energyConsumption;

    public ElectricModel(String manufacturer, String modelName, int power, int batteryCapacity, int energyConsumption) {
        super(manufacturer, modelName, power);
        this.batteryCapacity = batteryCapacity;
        this.energyConsumption = energyConsumption;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public int getEnergyConsumption() {
        return energyConsumption;
    }

    @Override
    public String toString() {
        return "ElectricModel{manufacturer='" + this.getManufacturer() + "', modelName='" + this.getModelName() + "', power='" + this.getPower() + "', batteryCapacity='" + this.getBatteryCapacity() + "', energyConsumption='" + this.getEnergyConsumption() + "'}";
    }
}
