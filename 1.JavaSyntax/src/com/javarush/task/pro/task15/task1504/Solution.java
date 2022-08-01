package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (InputStream input = Files.newInputStream(Path.of(file1));
             OutputStream output = Files.newOutputStream(Path.of(file2))) {
            byte[] dataIn = input.readAllBytes();
            byte[] dataOut = new byte[dataIn.length];
            for (int i = 0; i < dataIn.length; i += 2) {
                if (i < dataIn.length - 1) {
                    dataOut[i] = dataIn[i + 1];
                    dataOut[i + 1] = dataIn[i];
                } else
                    dataOut[i] = dataIn[i];
            }
            output.write(dataOut);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

