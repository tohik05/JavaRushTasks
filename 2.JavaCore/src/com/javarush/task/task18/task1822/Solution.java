package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            while (reader.ready()){
                String line = reader.readLine();
                String[] product = line.split(" ");
                if (product[0].equals(args[0])){
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt