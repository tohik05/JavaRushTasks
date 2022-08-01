package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file1 = input.readLine();
        String file2 = input.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            while (reader.ready()) {
                String temp = reader.readLine();
                String[] arr = temp.split(" ");
                for (String print : arr) {
                    double doubleValue = Double.parseDouble(print);
                    print = String.valueOf((int) Math.round(doubleValue));
                    writer.write(print + " ");
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt