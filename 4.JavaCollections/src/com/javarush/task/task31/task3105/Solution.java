package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\JavaPrograms\\TEST\\result.txt";//args[0]
        String filePath = "C:\\JavaPrograms\\TEST\\pathToTest\\test.zip";//args[1]

        ZipInputStream zin = new ZipInputStream(new FileInputStream(filePath));

        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(filePath));
        Files.copy(Path.of(filePath), Path.of(filePath));

        ZipEntry zipEntry = new ZipEntry("result.txt");
        zout.putNextEntry(zipEntry);

        zout.closeEntry();
        zout.close();

    }

}
