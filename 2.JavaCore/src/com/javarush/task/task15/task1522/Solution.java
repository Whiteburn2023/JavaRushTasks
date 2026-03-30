package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем знание Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        String str = new Scanner(System.in).nextLine();
        if (Planet.SUN.equalsIgnoreCase(str)){
            thePlanet = Sun.getInstance();
        } else if (Planet.MOON.equalsIgnoreCase(str)) {
            thePlanet = Moon.getInstance();
        } else if (Planet.EARTH.equalsIgnoreCase(str)){
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
        // implement step #5 here - реализуйте задание №5 тут
    }
}
