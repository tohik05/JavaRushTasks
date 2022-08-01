package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            switch (input) {
                case Planet.SUN -> thePlanet = Sun.getInstance();
                case Planet.MOON -> thePlanet = Moon.getInstance();
                case Planet.EARTH -> thePlanet = Earth.getInstance();
                default -> thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
