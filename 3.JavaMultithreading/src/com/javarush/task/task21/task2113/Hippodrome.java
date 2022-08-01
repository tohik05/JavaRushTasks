package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    void run() {
        System.out.println("Старт");
        for (int i = 0; i < 100; i++) {
            try {
                move();
                print();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void move() {
        for (Horse tmp : horses) {
            tmp.move();
        }
    }

    void print() {
        for (Horse tmp : horses) {
            tmp.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Comparator<Horse> comparator = Comparator.comparingDouble(winner -> winner.getDistance());
        Collections.sort(horses, comparator);
        return horses.get(horses.size()-1);
    }

    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().name);
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        Horse first = new Horse("1st horse", 3, 0);
        Horse second = new Horse("2nd horse", 3, 0);
        Horse third = new Horse("3rd horse", 3, 0);
        horses.add(first);
        horses.add(second);
        horses.add(third);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
