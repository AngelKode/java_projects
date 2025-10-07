package com.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

public class PropertiesAssignment {
    public static void main(String[] args) {
        //Get the file of the new properties
        try{
            FileInputStream newPropertiesFile = new FileInputStream("./basics/src/config.properties");

            Properties newProperties = new Properties(System.getProperties());
            newProperties.load(newPropertiesFile);

            System.setProperties(newProperties);

            System.out.println(System.getProperty("config.app.maxRam"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Get environment variables
        System.getenv().forEach((key, value) -> System.out.println(key + "=" + value));

        //Execute applications from java programs
        Runtime runtime = Runtime.getRuntime();
        Process currentProcess = null;

        try{
            if(System.getProperty("os.name").toLowerCase().contains("windows")){
                currentProcess = runtime.exec("notepad");
            }
            assert currentProcess != null;
            currentProcess.waitFor();
            System.exit(0);
        }catch (Exception e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }
}
