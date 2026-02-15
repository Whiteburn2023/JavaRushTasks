package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;

        while (input.hasNextInt()){
            n = input.nextInt();
            if (n % 2 == 0 && i < 1) {
                max = n;
                i++;
            } else if (n % 2 == 0) {
                if (max < n) {
                    max = n;
                }
                i++;
            }
        }
        System.out.println(max);

    }
}