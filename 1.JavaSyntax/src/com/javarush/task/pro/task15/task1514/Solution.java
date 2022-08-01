package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path1 = Path.of(scanner.nextLine());
        Path path2 = Path.of(scanner.nextLine());
        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception ignored) {
        }
    }
}

