package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            int result = NOS(scanner.nextInt(), scanner.nextInt());
            System.out.println("Наибольший общий делитель = " + result);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }

    private static int NOS(int x, int y) {
        if (x <= 0 || y <= 0) throw new UnsupportedOperationException("Incorrect input");
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
