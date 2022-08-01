package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();
        FileInputStream reader = new FileInputStream(file);

        ArrayList<Integer> alist = new ArrayList<>();

        while (reader.available() > 0) {
            int data = reader.read();
            alist.add(data);
        }
        reader.close();

        Set<Integer> set = new TreeSet<>(alist);
        for (Integer print : set){
            System.out.print(print + " ");
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt

