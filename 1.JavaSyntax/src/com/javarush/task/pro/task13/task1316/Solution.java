package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] enums = JavarushQuest.values();
        for (JavarushQuest temp: enums) {
            System.out.println(temp.ordinal());
        }
    }
}