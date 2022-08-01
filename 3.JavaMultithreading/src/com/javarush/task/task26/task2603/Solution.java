package com.javarush.task.task26.task2603;

import java.util.Comparator;

/* 
Убежденному убеждать других не трудно
*/

public class Solution {

    public static class CustomizedComparator<T> implements Comparator<T>{
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... vararg) {
            this.comparators = vararg;
        }

        @Override
        public int compare(T o1, T o2) {
            for (Comparator<T> tmp : comparators){
                int result = tmp.compare(o1, o2);
                if (result != 0) {
                    break;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
