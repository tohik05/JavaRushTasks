package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = input.readLine()).equals("exit")) {
            new ReadThread(fileName);
        }
    }

    public static class ReadThread extends Thread {
        private String threadFile;

        public ReadThread(String fileName) throws IOException {
            this.threadFile = fileName;
            start();
        }

        @Override
        public void run() {
            int[] byteCountArray = new int[256];
            try (FileInputStream fileInputStream = new FileInputStream(threadFile)) {
                while (fileInputStream.available() > 0) {
                    byteCountArray[fileInputStream.read()] += 1;
                }
                int maxCount = 0;
                for (int bytes : byteCountArray) {
                    if (bytes > maxCount) {
                        maxCount = bytes;
                    }
                }
                for (int i = 0; i < byteCountArray.length; i++) {
                    if (byteCountArray[i] == maxCount) {
                        resultMap.put(threadFile, i);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt