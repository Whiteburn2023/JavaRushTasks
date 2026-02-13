package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {

        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        if (Math.abs(a - b) < 0.000001){
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }

    }
}
