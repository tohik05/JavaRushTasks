package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun {
        public void climb() {
            System.out.println("Лезу");
        }
        public void run() {
            System.out.println("Бегу");
        }

    }

    public class Dog implements CanRun {
        public void run() {
            System.out.println("Бегу");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun {
        public void fly() {
            System.out.println("Лечу");
        }
        public void run() {
            System.out.println("Бегу");
        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
}
