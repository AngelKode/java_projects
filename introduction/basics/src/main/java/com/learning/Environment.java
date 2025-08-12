package com.learning;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

public class Environment {
    public static void main(String[] args) {

        //Get file of properties
        try(FileInputStream propertyFileStream = new FileInputStream("./basics/src/config.properties")) {
            System.out.println("Reading file...");

            //Load custom prop file
            Properties customProperties = new Properties(System.getProperties());
            customProperties.load(propertyFileStream);

            //Edit prop object
            customProperties.setProperty("server.maxRequests","10");

            //Load new properties
            System.setProperties(customProperties);
        }catch (Exception e) {
            System.out.println("Error while reading file: \n" + e.getMessage());
        }

        System.getProperties().list(System.out);


        //--------------------------ENV---------------------------------

        System.out.println(System.getenv());
    }
}
