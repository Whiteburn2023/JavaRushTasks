package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        array = new int[n];
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (i == 0) {
                min = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
