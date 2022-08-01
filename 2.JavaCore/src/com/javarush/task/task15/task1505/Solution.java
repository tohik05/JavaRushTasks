package com.javarush.task.task15.task1505;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        @Override
        public int getWeight() {
            return 85;
        }

        @Override
        public int getHeight() {
            return 185;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Мой рост " + human.getHeight());
        System.out.println("Мой вес " + human.getWeight());
    }
}