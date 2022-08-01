package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 1, 1, 0, 1},
                {0, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {0, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 8");
    }

    public static int getRectangleCount(byte[][] a) {
        int counter = 0;
        int tempCounter = -1;
        int indexFind = -1;
        boolean newRectangle = false;
        while (tempCounter != counter) {
            tempCounter = counter;
            begin:
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] == 1 && !newRectangle) {
                        newRectangle = true;
                        counter++;
                        indexFind = j;
                        a[i][j] = 0;
                    } else if (a[i][j] == 1 && newRectangle && j >= indexFind) {
                        a[i][j] = 0;
                    } else if (a[i][j] == 0 && newRectangle && j > indexFind) {//переход на новую строку
                        break;
                    } else if (a[i][j] == 0 && newRectangle && j == indexFind) {//выход из цикла, сброс маркеров
                        break begin;
                    }
                }
            }
            newRectangle = false;
            indexFind = -1;
        }
        return counter;
    }
}
