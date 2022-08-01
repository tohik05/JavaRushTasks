package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
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
        double max = Collections.max(personal.values());
        for (Map.Entry<String, Double> pair : personal.entrySet()) {
            if (pair.getValue() == max) {
                System.out.println(pair.getKey());
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt