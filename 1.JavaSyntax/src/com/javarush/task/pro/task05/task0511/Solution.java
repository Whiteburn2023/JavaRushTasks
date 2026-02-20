package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++){
//            array[i] = input.nextInt();
//        }
//        multiArray = new int[n][];
//        for (int i = 0; i < multiArray.length; i++) {
//            multiArray[i] = new int[array[i]];
//        }

        multiArray = new int[n][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[input.nextInt()];
            System.out.println(Arrays.toString(multiArray[i]));
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
