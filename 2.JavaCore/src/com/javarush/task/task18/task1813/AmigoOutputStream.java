package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream test;
    public static String fileName = "C:/Users/Тоха/Desktop/testjava3.txt";

    public AmigoOutputStream(FileOutputStream test) throws FileNotFoundException {
        super(fileName,true);
        this.test = test;
    }

    @Override
    public void write(int b) throws IOException {
        this.test.write(b);
    }

    @Override
    public void flush() throws IOException {
        this.test.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.test.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.test.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("\nJavaRush © All rights reserved.".getBytes());
        test.close();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName,true)).close();
    }
}
//C:\Users\Тоха\Desktop\testjava3.txt
