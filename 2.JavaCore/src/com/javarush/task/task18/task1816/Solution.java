package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        HashSet<Character> alphabet = new HashSet<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabet.add(i);
        }
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        int counter = 0;
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                int data = reader.read();
                if (alphabet.contains((char)data)){
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt