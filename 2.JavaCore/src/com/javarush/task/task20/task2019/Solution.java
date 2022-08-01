package com.javarush.task.task20.task2019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Исправить ошибку. Сериализация
*/

public class Solution implements Serializable {

    public static void main(String[] args) throws Exception {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Тоха\\Desktop\\testjava.txt"));

        Solution solution = new Solution();
        outputStream.writeObject(solution);

        outputStream.close();

        //load
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Тоха\\Desktop\\testjava.txt"));

        Solution loadedObject = (Solution) inputStream.readObject();

        inputStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public Solution() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return m.size();
    }
}
