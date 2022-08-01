package com.javarush.task.task19.task1907;

import java.io.*;
import java.util.ArrayList;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            ArrayList<Integer> list = new ArrayList<>();
            try (FileReader reader = new FileReader(file)) {
                while (reader.ready()) {
                    list.add(reader.read());
                }
            }
            String fullText = "";
            for (Integer toString : list) {
                fullText += (char) (int) toString;
            }
            String[] textArr = fullText.split("\\W");
            int countTheWorld = 0;
            for (String findTheWorld : textArr) {
                if (findTheWorld.equals("world")) {
                    countTheWorld++;
                }
            }
            System.out.println(countTheWorld);
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt