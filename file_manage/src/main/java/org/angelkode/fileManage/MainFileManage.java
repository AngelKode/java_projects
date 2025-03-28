package org.angelkode.fileManage;

import org.angelkode.fileManage.services.FileService;

public class MainFileManage {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\200an\\Desktop\\myFile.txt";
        FileService fileService = new FileService();
        fileService.createFile(filePath);
    }
}
