package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            Set<Wheel> set = new HashSet<>(Wheel.values().length);
                for (String wheel : loadWheelNamesFromDB()) {
                    if (loadWheelNamesFromDB().length != Wheel.values().length) throw new IllegalArgumentException();
                    set.add(Wheel.valueOf(wheel));
                }
                if (set.size() != Wheel.values().length) throw new IllegalArgumentException();
            wheels = new ArrayList<>(set);
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        for (Wheel tmp : car.wheels) {
            System.out.println(tmp);
        }
    }
}
