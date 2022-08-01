package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();
        FileInputStream reader = new FileInputStream(file);
        int min = reader.read();
        while (reader.available() > 0) {
            int data = reader.read();
            if (data < min) {
                min = data;
            }
        }
        reader.close();
        System.out.println(min);
    }
}
//C:\Users\Тоха\Desktop\testjava.txt