package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> fileName = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < fileName.size(); i = i + 2) {
                String result = fileName.get(i);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Something wrong" + e);
        }
    }
}

