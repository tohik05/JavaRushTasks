package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) {
                    list.addAll(Arrays.asList(reader.readLine().split("\\s")));
                }
            }
        }
        StringBuilder result = getLine(getWords(list));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        if (words == null || words.length == 0) return builder;
        if (words.length == 1 || words[0].equals("")) return builder.append(words[0]);
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
//        System.out.println("Первое слово в цепочке - " + getFirstWord(list));
//        System.out.println("Последнее слово в цепочке - " + getLastWord(list));
        String firstWord = getFirstWord(list);
//        System.out.println("first word is - "+ firstWord);
        String firstWordLetter = firstWord.substring(firstWord.length() - 1);

        while (list.size() >= 1) {
//            System.out.println(list);
            begin:
            for (int i = 0; i < list.size(); i++) {
                String nextWord = list.get(i);
                if (nextWord.equals(getLastWord(list))) continue;
                String secondWordLetter = nextWord.substring(0, 1);
//                System.out.println("Первое слово, последний символ - " + firstWordLetter);
//                System.out.println("Следущее слово, первый символ - " + secondWordLetter);
                if (firstWordLetter.equalsIgnoreCase(secondWordLetter)) {
                    if (builder.toString().length() == 0) {
                        builder.append(firstWord).append(" ");
                        list.remove(firstWord);
                    } else {
                        builder.append(" ");
                    }
                    builder.append(nextWord);
                    firstWordLetter = nextWord.substring(nextWord.length() - 1);
                    list.remove(nextWord);
                    break begin;
                }
            }
        }
        return builder;
    }

    public static String[] getWords(List<String> list) {
        String[] str = new String[list.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = list.get(i);
        }
        return str;
    }

    public static String getLastWord(List<String> list) {
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String firstWord = list.get(i);
            String firstWordLetter = firstWord.substring(firstWord.length() - 1);
//            System.out.println("Первое слово, последний символ - " + firstWordLetter);
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                String nextWord = list.get(j);
                String secondWordLetter = nextWord.substring(0, 1);
//                System.out.println("Следущее слово, первый символ - " + secondWordLetter);
                if (firstWordLetter.equalsIgnoreCase(secondWordLetter)) {
//                    System.out.println("Совпадение найдено!");
                    break;
                }
                if (j == list.size() - 1) return list.get(i);
            }
        }
        return "";
    }

    public static String getFirstWord(List<String> list) {
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String firstWord = list.get(i);
            String firstWordLetter = firstWord.substring(0, 1);
//            System.out.println("Первое слово, первый символ - " + firstWordLetter);
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                String nextWord = list.get(j);
                String secondWordLetter = nextWord.substring(nextWord.length() - 1);
//                System.out.println("Следущее слово, последний символ - " + secondWordLetter);
                if (firstWordLetter.equalsIgnoreCase(secondWordLetter)) {
//                    System.out.println("Совпадение найдено!");
                    break;
                }
                if (j == list.size() - 1) return list.get(i);
            }
        }
        return list.get((int) (Math.random() * list.size()));
    }
}
//C:\Users\Тоха\Desktop\testjava.txt