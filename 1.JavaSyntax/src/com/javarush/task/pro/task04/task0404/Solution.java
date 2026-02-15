package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int x = 0, y = 0;

        while (x++ < 5) {
            while (y++ < 10) {
                System.out.print("Q");
            }
            y = 0;
            System.out.println();
        }

    }
}
