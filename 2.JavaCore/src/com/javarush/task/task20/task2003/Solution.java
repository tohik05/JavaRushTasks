package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    static {
        runtimeStorage.put("One", "1");
        runtimeStorage.put("Two", "2");
        runtimeStorage.put("Three", "3");
    }

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        properties.putAll(runtimeStorage);
        properties.store(outputStream, "JavaRush task");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        runtimeStorage = new HashMap(properties);
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(reader.readLine());
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            save(fos);
            load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(runtimeStorage);
    }
}
//C:\Users\Тоха\Desktop\testjava.txt