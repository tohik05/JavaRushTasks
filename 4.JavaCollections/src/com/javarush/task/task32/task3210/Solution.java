package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        String writeTrue = "true";
        String writeFalse = "false";
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            raf.seek(number);
            byte[] tmp = new byte[text.length()];
            raf.read(tmp, 0, text.length());
            String readText = new String(tmp);
            raf.seek(raf.length());
            if (readText.equals(text)){
                raf.write(writeTrue.getBytes());
            }else {
                raf.write(writeFalse.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
