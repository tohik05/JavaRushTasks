package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        try(BufferedReader inputFile = new BufferedReader(new InputStreamReader(System.in))) {
            String file = inputFile.readLine();
            PrintStream input = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);
            testString.printSomething();
            String result = outputStream.toString();
            System.setOut(input);
            System.out.println(result);
            byte[] arr = result.getBytes();
            try (FileOutputStream writer = new FileOutputStream(file)){
                for (byte temp : arr){
                    writer.write(temp);
                }
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt