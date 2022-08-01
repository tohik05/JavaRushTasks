package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        char space = ' ';
        System.out.println(space);
        float symbolCounter = 0;
        float spaceCounter = 0;
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                int data = reader.read();
                symbolCounter++;
                if (data == space) {
                    spaceCounter++;
                }
            }
//            System.out.println("Количество пробелов " + spaceCounter);
//            System.out.println("Количество символов " + symbolCounter);
            System.out.printf("%.2f", (spaceCounter / symbolCounter) * 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt