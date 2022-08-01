package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = input.readLine();
            String file2 = input.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(file1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                String text = "";
                while (reader.ready()) {
                    text += reader.readLine();
                }
                text = text.replaceAll("\\.", "!");
                writer.write(text);
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt