package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream input = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(input);
        String[] split = result.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        int c = 0;
        switch (split[1]) {
            case "+":
                c = a + b;
                System.out.printf("%d + %d = %d", a, b, c);
                break;
            case "-":
                c = a - b;
                System.out.printf("%d - %d = %d", a, b, c);
                break;
            case "*":
                c = a * b;
                System.out.printf("%d * %d = %d", a, b, c);
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

