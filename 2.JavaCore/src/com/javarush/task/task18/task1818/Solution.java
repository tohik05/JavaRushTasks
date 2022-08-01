package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите путь к первому файлу");
            String file1 = input.readLine();
            System.out.println("Введите путь ко второму файлу");
            String file2 = input.readLine();
            System.out.println("Введите путь к третьему файлу");
            String file3 = input.readLine();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1, true));
                 BufferedReader reader1 = new BufferedReader(new FileReader(file2));
                 BufferedReader reader2 = new BufferedReader(new FileReader(file3))) {
                String line;
                while (reader1.ready()) {
                    line = reader1.readLine();
                    writer.write(line);
                }
                while (reader2.ready()) {
                    line = reader2.readLine();
                    writer.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt