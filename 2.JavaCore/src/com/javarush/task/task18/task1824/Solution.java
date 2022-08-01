package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String file = input.readLine();
                try (FileInputStream stream = new FileInputStream(file)) {
                } catch (FileNotFoundException e) {
                    System.out.println(file);
                    break;
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt