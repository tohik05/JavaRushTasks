package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        Integer[] test = new Integer[]{14, 10, 13, 13, 15, 12, 10, 12, 10, 9, 9, 7, 5, 15, 16, 4, 2, 19, 11};
//        Integer[] test = new Integer[]{10,20,20,30,20,50,60,22};
        System.out.println(Arrays.toString(sort(test)));
    }

    public static Integer[] sort(Integer[] array) {
        Integer[] sortArr = array;
        Arrays.sort(sortArr);
        double median = sortArr.length % 2 == 0 ? (double)((sortArr[sortArr.length / 2] + sortArr[sortArr.length / 2 - 1]) / 2) : (double)sortArr[(sortArr.length - 1) / 2];
        System.out.println(median);
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int)(Math.abs(median - o1) - Math.abs(median - o2));
            }
        };
        Arrays.sort(array, comp);
        return array;
    }
}
