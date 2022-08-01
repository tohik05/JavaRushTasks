package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        try (FileInputStream input = new FileInputStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            ArrayList<Integer> digits = new ArrayList<>();
            while (reader.ready()) {
                int tmp = Integer.parseInt(reader.readLine());
                if (tmp % 2 == 0) {
                    digits.add(tmp);
                }
            }
            Collections.sort(digits);
            digits.forEach(result -> System.out.println(result));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt
