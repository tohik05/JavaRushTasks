package com.javarush.task.task19.TEST;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String str = "test";
        char[] cbuf = new char[]{'a','b','c'};
        int off = 1;
        int len = 2;
        System.out.println(String.valueOf(cbuf, off, len));
        System.out.println(new StringBuilder().append(cbuf).append(off).append(len));
    }
}

//C:\Users\Тоха\Desktop\testjava.txt