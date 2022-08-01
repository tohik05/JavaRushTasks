package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утильный класс: часть 1
*/

public class Solution {

    public static double sin(double a) {
        double sin = Math.sin(Math.toRadians(a));
        return sin;
    }

    public static double cos(double a) {
        double cos = Math.cos(Math.toRadians(a));
        return cos;
    }

    public static double tan(double a) {
        double tan = Math.tan(Math.toRadians(a));
        return tan;
    }
}
