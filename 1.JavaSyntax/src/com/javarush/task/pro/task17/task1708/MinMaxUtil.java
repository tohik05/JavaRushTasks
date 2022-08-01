package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {

    public static int min(int value) {
        return value;
    }

    public static int min(int value, int value2) {
        return Math.min(value, value2);
    }

    public static int min(int value, int value2, int value3) {
        return Math.min(value, Math.min(value2, value3));
    }

    public static int min(int value, int value2, int value3, int value4) {
        return Math.min(value, Math.min(value2, Math.min(value3, value4)));
    }

    public static int min(int value, int value2, int value3, int value4, int value5) {
        return Math.min(value, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
    }

    public static int max(int value) {
        return value;
    }

    public static int max(int value, int value2) {
        return Math.max(value, value2);
    }

    public static int max(int value, int value2, int value3) {
        return Math.max(value, Math.max(value2, value3));
    }

    public static int max(int value, int value2, int value3, int value4) {
        return Math.max(value, Math.max(value2, Math.max(value3, value4)));
    }

    public static int max(int value, int value2, int value3, int value4, int value5) {
        return Math.max(value, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
    }
}
