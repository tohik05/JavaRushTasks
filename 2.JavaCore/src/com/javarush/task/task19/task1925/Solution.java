package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String tmp : split) {
                    if (tmp.length() > 6) {
                        builder.append(tmp).append(",");
                    }
                }
            }
            int indexOfLastComa = builder.lastIndexOf(",");
            builder.deleteCharAt(indexOfLastComa);
            writer.write(builder.toString());
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt