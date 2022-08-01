package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.*;

/* 
Генератор паролей
*/

public class Solution {
    private static boolean useLower = false;
    private static boolean useUpper = false;
    private static boolean useDigit = false;

    private static String digits = "0123456789";
    private static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String allSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());

    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        StringBuilder password = new StringBuilder();
        for (String tmp : mixSymbols()) {
            password.append(tmp);
        }
        byte[] buffer = password.toString().getBytes();
        result.write(buffer, 0, buffer.length);
        return result;
    }

    private static List<String> mixSymbols() {
        Random random = new Random();
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(lowerCase.charAt(random.nextInt(lowerCase.length()))));
        list.add(String.valueOf(upperCase.charAt(random.nextInt(upperCase.length()))));
        list.add(String.valueOf(digits.charAt(random.nextInt(digits.length()))));
        while (list.size() < 8) {
            list.add(String.valueOf(allSymbols.charAt(random.nextInt(allSymbols.length()))));
        }
        Collections.shuffle(list);
        return list;
    }

}
