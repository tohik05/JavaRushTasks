package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int count = 0;
                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(" ");
                    for (String list : words) {
                        for (String temp : split) {
                            if (list.equals(temp)) {
                                count++;
                            }
                        }
                    }
                    if (count == 2) {
                        System.out.println(line);
                    }
                    count = 0;
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt