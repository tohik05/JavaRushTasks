package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Вася Пупкин", 4.0);
        grades.put("Дима Ларин", 4.5);
        grades.put("Коля Быков", 3.5);
        grades.put("Сергей Пенкин", 5.0);
        grades.put("Юра Сюткин", 4.4);
    }
}
