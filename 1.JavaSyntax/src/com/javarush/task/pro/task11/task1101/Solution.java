package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.getAge() + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.getPlanetsCount() + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.getStarsCount() + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.getStarName() + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.getGalacticCenterDistance() + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
