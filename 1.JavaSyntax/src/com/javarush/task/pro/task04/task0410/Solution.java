package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (input.hasNextInt()) {
            int tmp = input.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp < secondMin && tmp != min) {
                    secondMin = tmp;
                }
            }
            System.out.println(secondMin);
        }
    }
