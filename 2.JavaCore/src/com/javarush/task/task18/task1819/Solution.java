package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file1 = input.readLine();
        String file2 = input.readLine();

        ByteArrayOutputStream writer = new ByteArrayOutputStream();//Масив байтов, имеет внутрений буфер buf, который хранит в себе записаный поток
        try (FileInputStream reader1 = new FileInputStream(file1);
             FileInputStream reader2 = new FileInputStream(file2)) {
            while (reader2.available() > 0) {
                writer.write(reader2.read());//записывает поток во внутрений буфер
            }
            while (reader1.available() > 0) {
                writer.write(reader1.read());
            }
        }
        try (FileOutputStream finish = new FileOutputStream(file1)) {
            writer.writeTo(finish);// записывает во внешний поток данные из внутренего буфера
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt