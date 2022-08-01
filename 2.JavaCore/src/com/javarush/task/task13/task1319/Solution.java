package com.javarush.task.task13.task1319;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                writer.write(line + "\n");
            }if (line.equals("exit")){
                writer.write(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt