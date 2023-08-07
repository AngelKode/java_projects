package com.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {
        System.out.println("Java home: " + System.getProperty("java.home"));
        System.out.println("User dir: " + System.getProperty("user.dir"));
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java vendor url: " + System.getProperty("java.vendor.url"));
        System.out.println("System architecture: " + System.getProperty("os.arch"));
        System.out.println("File separator character: " + System.getProperty("file.separator"));

        try {
          FileInputStream myFileInputStream = new FileInputStream("./introduction/basics/src/main/java/com/learning/config.properties"); 
          Properties properties = new Properties(System.getProperties());
          properties.load(myFileInputStream);
          
          System.setProperties(properties);
          System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            System.out.println("Error while creating file stream: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
