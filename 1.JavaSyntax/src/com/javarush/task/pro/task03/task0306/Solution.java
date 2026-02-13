package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();

        boolean isOneTwo = (a + b) > c;
        boolean isTwoThree = (a + c) > b;
        boolean isOneThree = (b + c) > a;

        if (isOneTwo && isTwoThree && isOneThree){
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

    }
}
