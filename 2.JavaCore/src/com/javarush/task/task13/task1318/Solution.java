package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        FileInputStream input = null;
        InputStreamReader reader = null;
        BufferedReader buffer = null;

        try {
            input = new FileInputStream(scanner.nextLine());
            reader = new InputStreamReader(input);
            buffer = new BufferedReader(reader);
            while (buffer.ready())
            {
                String line = buffer.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            input.close();
            reader.close();
            buffer.close();
        }
    }
}