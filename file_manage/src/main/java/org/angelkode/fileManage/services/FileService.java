package org.angelkode.fileManage.services;

import org.angelkode.fileManage.interfaces.FileBaseService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService extends FileBaseService {

    @Override
    public void createFile(String fileName) {
        //Create File
        File fileToCreate = new File(fileName);

        try {
            //Create object to write into file
            FileWriter fw = new FileWriter(fileToCreate, true);

            //Set content
            fw.append("Creating first content").append(System.lineSeparator());

            //Close data stream
            fw.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
