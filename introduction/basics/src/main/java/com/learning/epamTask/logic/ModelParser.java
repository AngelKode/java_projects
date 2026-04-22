package com.learning.epamTask.logic;

import com.learning.epamTask.models.ElectricModel;
import com.learning.epamTask.models.Model;
import com.learning.epamTask.models.RegularModel;

import java.util.Objects;
import java.util.StringTokenizer;

public class ModelParser {
    public static Model parse(String line){
        String[] parameters = new String[6];
        StringTokenizer tokenizer = new StringTokenizer(line,",");
        int parametersReceived = 0;
        while(tokenizer.hasMoreTokens()){
            parameters[parametersReceived] = tokenizer.nextToken();
            parametersReceived++;
        }
        if(!(Objects.equals(parameters[0], "Regular") || Objects.equals(parameters[0], "Electric"))){
            throw new IllegalArgumentException("Unknown type: " + parameters[0]);
        }

        if(parametersReceived != 6){
            throw new IllegalArgumentException("Invalid number of parameters. Expected 6, received: " + parametersReceived);
        }

        if(Objects.equals(parameters[0], "Regular")){
            return new RegularModel(parameters[1], parameters[2],Integer.parseInt(parameters[3]),Integer.parseInt(parameters[4]),Double.parseDouble(parameters[5]));
        }

        return new ElectricModel(parameters[1], parameters[2],Integer.parseInt(parameters[3]),Integer.parseInt(parameters[4]),Integer.parseInt(parameters[5]));
    }
}
