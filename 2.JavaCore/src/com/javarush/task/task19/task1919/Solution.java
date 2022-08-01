package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        Map<String, Double> personal = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                if (personal.containsKey(split[0])) {
                    personal.put(split[0], personal.get(split[0]) + Double.parseDouble(split[1]));
                } else {
                    personal.put(split[0], Double.parseDouble(split[1]));
                }
            }
        }
        for (Map.Entry<String, Double> pair : personal.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt