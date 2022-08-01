package com.javarush.task.task22.task2208;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        map.put(null, null);
        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            if (builder.toString().length() != 0){
                builder.append(" and ");
            }
            builder.append(String.format("%s = '%s'", entry.getKey(), entry.getValue()));
        }
        return builder.toString();
    }
}
