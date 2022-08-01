package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] result = new Month[]{DECEMBER, JANUARY, FEBRUARY};
        return result;
    }

    public static Month[] getSpringMonths() {
        Month[] result = new Month[]{MARCH, APRIL, MAY};
        return result;
    }

    public static Month[] getSummerMonths() {
        Month[] result = new Month[]{JUNE, JULY, AUGUST};
        return result;
    }

    public static Month[] getAutumnMonths() {
        Month[] result = new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWinterMonths()));
        System.out.println(Arrays.toString(getSpringMonths()));
        System.out.println(Arrays.toString(getSummerMonths()));
        System.out.println(Arrays.toString(getAutumnMonths()));
    }
}
