package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if (args.length == 0) {
            return;
        }
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                list.add(reader.read());
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int countDuplicate = 1;
            if (!map.containsKey(list.get(i))) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j).equals(list.get(i))) {
                        countDuplicate++;
                    }
                }
                map.put(list.get(i), countDuplicate);
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            for (int i = 0; i < 128; i++) {
                if (pair.getKey().equals(i)) {
                    System.out.println((char) i + " " + pair.getValue());
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt