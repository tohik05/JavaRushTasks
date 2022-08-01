package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = input.readLine();
            String file2 = input.readLine();
            try (FileReader reader = new FileReader(file1);
                 FileWriter writer = new FileWriter(file2)) {
                int count = 1;
                while (reader.ready()) {
                    int data = reader.read();
                    if (count % 2 == 0) {
                        writer.write(data);
                    }
                    count++;
                }
            }
        }

    }
}
//C:\Users\Тоха\Desktop\testjava.txt