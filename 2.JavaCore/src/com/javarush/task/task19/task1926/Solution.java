package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                String reverse = "";
                while ((line = reader.readLine()) != null) {
                    for (int i = line.length() - 1; i >= 0; i--) {
                        reverse += line.charAt(i);
                    }
                    System.out.println(reverse);
                    reverse = "";
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt