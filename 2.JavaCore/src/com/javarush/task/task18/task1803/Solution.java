package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();
        FileInputStream reader = new FileInputStream(file);

        ArrayList<Integer> bytes = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (reader.available() > 0) {
            int data = reader.read();
            bytes.add(data);
        }
        reader.close();

        for (int i = 0; i < bytes.size()-1; i++) {
            int countDuplicate = 0;
            if (!map.containsKey(bytes.get(i))) {
                for (int j = i + 1; j < bytes.size(); j++) {
                    if (bytes.get(j).equals(bytes.get(i))) {
                        countDuplicate++;
                    }
                }
                map.put(bytes.get(i), countDuplicate);
            }
        }

        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
//            if (pair.getValue() == max){
                System.out.println(pair.getKey() + " " + pair.getValue());
//            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt