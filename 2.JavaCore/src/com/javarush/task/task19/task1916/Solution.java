package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int size1 = 0;
        int size2 = 0;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = input.readLine();
            String file2 = input.readLine();
            try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                 BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
                String line;
                while ((line = reader1.readLine()) != null) {
                    list1.add(line);
                }
                while ((line = reader2.readLine()) != null) {
                    list2.add(line);
                }
            }
        }
        while ((size1 < list1.size()) && (size2 < list2.size())) {
            if (list1.get(size1).equals(list2.get(size2))) {
                lines.add(new LineItem(Type.SAME, list1.get(size1)));
                size1++;
                size2++;
            } else if ((size1 + 1 < list1.size()) && list1.get(size1 + 1).equals(list2.get(size2))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(size1)));
                size1++;
            } else if ((size2 + 1 < list2.size()) && list1.get(size1).equals(list2.get(size2 + 1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(size2)));
                size2++;
            }
        }
        while (size1 < (list1.size())) {
            lines.add(new LineItem(Type.REMOVED, list1.get(size1)));
            size1++;
        }
        while (size2 < (list2.size())) {
            lines.add(new LineItem(Type.ADDED, list2.get(size2)));
            size2++;
        }
//        for (var p : lines) {
//            System.out.printf("%s %s\n", p.type, p.line);
//        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt