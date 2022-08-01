package com.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path result : files) {
                if (Files.isRegularFile(result)) {
                    System.out.println(result + THIS_IS_FILE);
                } else if (Files.isDirectory(result)) {
                    System.out.println(result + THIS_IS_DIR);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}

