package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Charset utf8 = StandardCharsets.UTF_8;
        Charset windows1251 = Charset.forName("Windows-1251");
        try (InputStream reader = new FileInputStream(args[0]);
             OutputStream writer = new FileOutputStream(args[1])) {

            byte[] buffer = new byte[1000];
            reader.read(buffer);
            String s = new String(buffer, windows1251);
            buffer = s.getBytes(utf8);
            writer.write(buffer);
        }
    }
}
