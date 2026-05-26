package com.javarush.task.jdk13.task34.task3404;

/* 
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }

    public static void moveRing(char a, char b, char c, int numRings) {
        if (numRings == 1) {
            System.out.println("перенести кольцо с " + a + " на " + b);
        } else {
            moveRing(a, c, b, numRings - 1);
            System.out.println("перенести кольцо с " + a + " на " + b);
            moveRing(c, b, a, numRings - 1);
        }
    }
}