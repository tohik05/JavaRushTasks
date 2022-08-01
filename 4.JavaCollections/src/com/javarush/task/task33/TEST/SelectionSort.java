package com.javarush.task.task33.TEST;

import java.util.Arrays;

public class SelectionSort {//Сортировка выбором
    public static void main(String[] args) {
        int[] massive = {52, 72, 1, 16, 4, 83, 12, 37, 21, 41, 67, 5, 48, 7, 31};
        System.out.println("Необходимо отсортировать масив из " + massive.length + " элементов");
        System.out.println("Before sort " + Arrays.toString(massive));
        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            int minElement = i;
            for (int j = i; j < massive.length; j++) {
                if (massive[j] < massive[minElement]) {
                    minElement = j;
                }
            }
            int temp = massive[i];
            massive[i] = massive[minElement];
            massive[minElement] = temp;
            count++;
        }
        System.out.println("After sort " + Arrays.toString(massive));
        System.out.println("Мы отсортировали наш масив за " + count + " шагов");
    }
}
