package com.javarush.task.task33.TEST;

import java.io.File;

public class test {

    public static void main(String[] args)
    {
        printAllFiles(new File("c:/Test/"));
    }

    public static void printAllFiles(File dir)
    {
        for (File file : dir.listFiles())
        {
            if (file.isDirectory())
                printAllFiles(file);
            else
                System.out.println(file.getAbsolutePath());
        }
    }
}
