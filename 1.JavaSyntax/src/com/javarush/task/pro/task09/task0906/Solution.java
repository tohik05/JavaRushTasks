package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String result = new String("");
        if (decimalNumber <= 0)
            return result;

        while (decimalNumber != 0) {
            result = decimalNumber % 2 + result;
            decimalNumber = decimalNumber / 2;
        }
        return result;
    }

    public static int toDecimal(String binaryNumber) {
        int result = 0;
        if (binaryNumber == null)
            return result;

        for (int i = 0; i < binaryNumber.length(); i++) {
            int count = binaryNumber.length() - 1 - i;
            int tmp = Character.getNumericValue(binaryNumber.charAt(count));
            result += tmp * (int) Math.pow(2, i);
        }
        return result;
    }
}