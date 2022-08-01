package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("com.javarush.task.task22.task2210", ".")));

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer token = new StringTokenizer(query, delimiter);
        String[] result = new String[token.countTokens()];
        while (token.hasMoreTokens()){
            for (int i = 0; i < result.length; i++) {
                result[i] = token.nextToken();
            }
        }
        return result;
    }
}
