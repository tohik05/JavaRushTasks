package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
*/

public class Solution {

    public static double sqrt(double a) {
        double sqrt = Math.sqrt(a);
        return sqrt;
    }

    public static double cbrt(double a) {
        double cbrt = Math.cbrt(a);
        return cbrt;
    }

    public static double pow(int number, int power) {
        double pow = Math.pow(number, power);
            return pow;
        }
//
//        int modulus = power < 0 ? power * -1 : power;
//        int result = number;
//        for (int i = 1; i < modulus; i++) {
//            result *= number;
//        }
//        return power < 0 ? 1.0 / result : result;
    }

