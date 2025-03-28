package org.angelkode.fileManage.services;

import org.angelkode.fileManage.interfaces.FileBaseService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService extends FileBaseService {

    @Override
    public void createFile(String fileName) {
        //Create File
        File fileToCreate = new File(fileName);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToCreate, true))){
            //For big writing data, we can use BufferedWriter, its more efficient than FileWriter
            //Set content
            bufferedWriter.append("Creating first content\n");
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
