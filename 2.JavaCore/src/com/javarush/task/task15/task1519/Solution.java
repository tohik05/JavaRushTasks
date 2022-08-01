package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result;
        while (!(result = reader.readLine()).equals("exit")) {
            if (isDigit(result)) {
                if (result.contains(".")) {
                    print(Double.parseDouble(result));
                } else if (Integer.parseInt(result) <= 0 || Integer.parseInt(result) >= 128) {
                    print(Integer.parseInt(result));
                } else if (Integer.parseInt(result) > 0 && Integer.parseInt(result) < 128) {
                    print((short) Integer.parseInt(result));
                }
            } else
                print(result);
        }
    }

    public static boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
