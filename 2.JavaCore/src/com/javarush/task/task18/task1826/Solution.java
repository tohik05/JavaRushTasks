package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream inputStream = new FileInputStream(args[1]);
             FileOutputStream outputStream = new FileOutputStream(args[2])) {
            if (args[0].equals("-e")) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() + 5);
                }
            } else if (args[0].equals("-d")) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() - 5);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}