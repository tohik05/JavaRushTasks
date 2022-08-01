package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        List<String> list = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) {
                    list.addAll(Arrays.asList(reader.readLine().split("\\s")));
                }
//                for (String p : list){
//                    System.out.println(p);
//                }
                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if (isPair(list.get(i), list.get(j))) {
                            Pair pair = new Pair();
                            pair.first = list.get(i);
                            pair.second = list.get(j);
                            result.add(pair);
                            list.set(i, "");
                            list.set(j, "");
                        }
                    }
                }
            }
        }
//        for (Pair p : result){
//            System.out.println(p);
//        }
    }

    public static boolean isPair(String first, String second) {
        if (first.equals("") || second.equals("")) return false;
        if (first.length() != second.length()) return false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(second.length() - 1 - i)) return false;
        }
        return true;
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
//C:\Users\Тоха\Desktop\testjava.txt