package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hasObject = null;
        String url = reader.readLine();
        String cut = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParam = cut.split("&");
        ArrayList<String> resultList = new ArrayList<>();
        for (String param : splitParam) {
            String[] result = param.split("=");
            resultList.add(result[0]);
            if (result[0].equals("obj")) {
                hasObject = result[1];
            }
        }
        for (String print : resultList) {
            System.out.print(print + " ");
        }
        if (hasObject != null) {
            try {
                alert(Double.parseDouble(hasObject));
            } catch (NumberFormatException nfe) {
                alert(hasObject);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("\n" + "double: " + value);
    }

    public static void alert(String value) {
        System.out.println("\n" + "String: " + value);
    }

}
