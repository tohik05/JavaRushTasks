package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();
        FileInputStream reader = new FileInputStream(file);

        ArrayList<Integer> alist = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (reader.available() > 0) {
            int data = reader.read();
            alist.add(data);//пишем в список
        }
        reader.close();

        for (int i = 0; i < alist.size(); i++) {
            int countDuplicate = 0;
            if (!map.containsKey(alist.get(i))) {//если значения по индексу нету в мапе, добавим
                for (int j = 0; j < alist.size(); j++) {
                    if (alist.get(i).equals(alist.get(j))) {//ищем дубликаты значения по индексу
                        countDuplicate++;//счетчик растет если дубликаты найдены
                    }
                }
//                if (countDuplicate > 1) { //в мапу добавляем только те значения у которых есть дубликат
                    map.put(alist.get(i), countDuplicate);
//                }
            }
        }

        int minDuplicate = Collections.min(map.values());//получает значение минимального количества повторов
        for (Map.Entry<Integer, Integer> result : map.entrySet()){
            if (result.getValue() == minDuplicate){
                System.out.print(result.getKey() + " ");
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt