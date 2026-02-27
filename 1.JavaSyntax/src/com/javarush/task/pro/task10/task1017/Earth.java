package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(100);
        NorthAmerica northAmerica = new NorthAmerica(200);
        Eurasia eurasia = new Eurasia(300);
        Australia australia = new Australia(340);
        Antarctica antarctica = new Antarctica(540);
        Africa africa = new Africa(300);
    }
}
