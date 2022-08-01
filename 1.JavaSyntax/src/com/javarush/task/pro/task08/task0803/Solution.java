package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int result = ints[0];
        for (int i = 1; i<ints.length; i++){
            result = Math.min(result,ints[i]);
        }
        return result;
    }

    public static int[] getArrayOfTenElements() {
        Scanner klava = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = klava.nextInt();
        }
        return array;
    }
}
