package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner klava = new Scanner(System.in);
        int n = klava.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = klava.nextInt();
        }
        if (n > 0 && n%2 == 0)
        for (int i = n-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        else
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}