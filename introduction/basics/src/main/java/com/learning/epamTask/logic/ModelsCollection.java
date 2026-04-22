package com.learning.epamTask.logic;

import com.learning.epamTask.models.ElectricModel;
import com.learning.epamTask.models.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ModelsCollection {
    private final List<Model> models;
    public ModelsCollection() {
        models = new ArrayList<>();
    }
    public void readFromFile(String filePath) {
        try{
            FileReader fileReader;
            StringTokenizer tokenizer = new StringTokenizer(filePath, "");
            String lineReaded = "";

            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((lineReaded = bufferedReader.readLine())!= null){
                models.add(ModelParser.parse(lineReaded));
            }
        }catch (FileNotFoundException ex){
            throw new RuntimeException("Error occurred while reading file: " + filePath);
        }catch (IOException ex){
            throw new RuntimeException("Error occurred while reading file: " + filePath);
        }

    }

    public Optional<Model> getModel(String manufacturer, String modelName) {
        return models.stream()
                .filter(model -> Objects.equals(model.getManufacturer(), manufacturer) && Objects.equals(model.getModelName(), modelName))
                .findFirst()
                .or(Optional::empty);
    }

    public List<ElectricModel> getElectricModelsByBatteryCapacity(int batteryCapacityLimit) {
        return models.stream()
                        .filter(model -> model instanceof ElectricModel)
                        .filter(model -> ((ElectricModel) model).getBatteryCapacity() >= batteryCapacityLimit)
                        .sorted(Comparator.comparing(Model::getManufacturer))
                        .map(model -> (ElectricModel) model)
                        .collect(Collectors.toList());
    }

}
