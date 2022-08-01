package com.javarush.task.pro.task15.task1516;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String path = scanner.nextLine();
            if (Files.isRegularFile(Path.of(path))) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(path))) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}

