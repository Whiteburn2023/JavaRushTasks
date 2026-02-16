package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        array = new int[n];
        int max = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
            if (i == 0){
                max = array[i];
            } else if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
