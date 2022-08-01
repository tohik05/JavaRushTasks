package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear;

    public Solution() {
        Calendar calendar = Calendar.getInstance();
        this.currentYear = calendar.get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
