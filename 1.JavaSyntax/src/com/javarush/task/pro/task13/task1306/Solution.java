package com.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 1
*/

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination,source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
//
//    public static void main(String[] args) {
//        ArrayList<String> test = new ArrayList<>();
//        test.add("one");
//        test.add("two");
//        test.add("three");
//        test.add("four");
//        test.add("five");
//        ArrayList<String> test2 = new ArrayList<>(test.size());
//
//        copy(test2, test);
//        test2.forEach(System.out::println);
//    }
}
