package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        boolean isSmallSize = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            FileInputStream inputStream = null;
            while (!isSmallSize) {
                String file = reader.readLine();
                inputStream = new FileInputStream(file);
                if (inputStream.available() < 1000) {
                    isSmallSize = true;
                }
            }
            inputStream.close();
            throw new DownloadException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class DownloadException extends Exception {

    }
}
//C:\Users\Тоха\Desktop\testjava.txt