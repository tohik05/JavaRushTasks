package com.javarush.task.task33.TEST;

import java.util.Arrays;

public class BubbleSort {//Сортировка пузырьком
    public static void main(String[] args) {
        int[] massive = {52, 72, 1, 16, 4, 83, 12, 37, 21, 41, 67, 5, 48, 7, 31};
        System.out.println("Необходимо отсортировать масив из " + massive.length + " элементов");
        System.out.println("Before sort " + Arrays.toString(massive));
        int count = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {//если 1й элемент меньше следующего, переместим его в ТЕМП
                    int temp = massive[i];
                    massive[i] = massive[i + 1];//на место 1го элемента ставим следующий
                    massive[i + 1] = temp;//на место следующего пишем сохраненный в ТЕМПе
                    needIteration = true;
                    count++;
                }
            }
        }
        System.out.println("After sort " + Arrays.toString(massive));
        System.out.println("Мы отсортировали наш масив за " + count + " шагов");
    }
}
