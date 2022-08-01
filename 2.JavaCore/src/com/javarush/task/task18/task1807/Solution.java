package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();
        FileInputStream reader = new FileInputStream(file);

        int count = 0;
        while (reader.available() > 0) {
            String line = String.valueOf(reader.read());
            if (line.contains("44")) {
                count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
//C:\Users\Тоха\Desktop\testjava.txt