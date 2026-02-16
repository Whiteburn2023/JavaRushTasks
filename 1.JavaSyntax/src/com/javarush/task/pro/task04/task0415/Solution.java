package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {

    public static void main(String[] args) {
        final double PI = 3.14;
        int radius = new Scanner(System.in).nextInt();
        int s = (int) Math.floor(PI * radius * radius);
        System.out.println(s);

    }
}