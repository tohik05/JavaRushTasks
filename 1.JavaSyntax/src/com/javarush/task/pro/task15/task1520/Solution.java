package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path result : files) {
                if (Files.isRegularFile(result)) {
                    Path resolve = targetDirectory.resolve(result.getFileName());
                    Files.move(result, resolve);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
