package com.learning.epamTask;

import com.learning.epamTask.models.ElectricCar;
import com.learning.epamTask.models.ElectricModel;

public class mainTask {
    public static void main(String[] args) {
        ElectricModel teslaModel = new ElectricModel("Tesla", "Model 3 RWD", 208, 60, 20);
        ElectricCar teslaCar = new ElectricCar("AA-BP-022", teslaModel, 60);

        int distance = 40;

        teslaCar.drive(distance);

        System.out.println(40 + "kWh" + " --- " + teslaCar.getBatteryLevel() + "kWh");
        System.out.println(100 + "km driven ---- " + teslaCar.getDistanceDriven() + " odometer");
    }
}
