package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        int speedMc = new Scanner(System.in).nextInt();
        int speedKm = (int)Math.round(speedMc * 3.6);
        System.out.println(speedKm);

    }
}