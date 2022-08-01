package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution task = new Solution();
        Scanner scanner = new Scanner(System.in);
        String line;
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        try (BufferedReader input = new BufferedReader(new FileReader(file1));
             BufferedReader input2 = new BufferedReader(new FileReader(file2))) {
            while ((line = input.readLine()) != null) {
                allLines.add(line);
            }
            while ((line = input2.readLine()) != null) {
                forRemoveLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            task.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Словил CorruptedDataException");
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt
