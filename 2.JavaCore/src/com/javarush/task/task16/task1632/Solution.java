package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new firstThread());
        threads.add(new secondThread());
        threads.add(new thirdThread());
        threads.add(new fourthThread());
        threads.add(new fifthThread());
    }

    public static void main(String[] args) {
        Thread thread1 = threads.get(0);
        thread1.start();
        Thread thread2 = threads.get(1);
        thread2.start();
        Thread thread3 = threads.get(2);
        thread3.start();
        Thread thread4 = threads.get(3);
        thread4.start();
        Thread thread5 = threads.get(4);
        thread5.start();
    }

    static class firstThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Бесконечный цикл");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class secondThread extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class thirdThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class fourthThread extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    static class fifthThread extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int sum = 0;
            {
                try {
                    while (!(input = reader.readLine()).equals("N")) {
                        sum += Integer.parseInt(input);
                    }
                    System.out.println(sum);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}