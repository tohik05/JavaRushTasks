package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = input.readLine();
            String file2 = input.readLine();


            try (BufferedReader reader = new BufferedReader(new FileReader(file1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                String line = null;
                while (reader.ready()) {
                    line = reader.readLine();
                }
                String[] digits = line.split(" ");
                for (String temp : digits){
                    if (temp.matches("\\d+"))
                        writer.write(temp + " ");
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt