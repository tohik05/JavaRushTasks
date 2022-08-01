package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int temp = month.ordinal();
        if (temp == 11){
            return Month.JANUARY;
        }else {
            Month nextMonth = Month.values()[temp + 1];
            return nextMonth;
        }
    }
}
