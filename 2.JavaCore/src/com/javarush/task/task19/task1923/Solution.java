package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String tmp : split) {
                    if (tmp.matches("(.*[0-9]+.*)")) {
                        writer.write(tmp + " ");
                    }
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt