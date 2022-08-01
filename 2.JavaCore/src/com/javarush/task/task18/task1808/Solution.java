package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();
            FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream outputStream1 = new FileOutputStream(file2);
            FileOutputStream outputStream2 = new FileOutputStream(file3);

            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                if (count % 2 == 0) {
                    outputStream1.write(buffer, 0, (count / 2));
                    outputStream2.write(buffer, (count / 2), (count / 2));
                } else {
                    outputStream1.write(buffer, 0, ((count / 2)+1));
                    outputStream2.write(buffer, (count / 2)+1, (count / 2));
                }
            }
            inputStream.close();
            outputStream1.close();
            outputStream2.close();
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt