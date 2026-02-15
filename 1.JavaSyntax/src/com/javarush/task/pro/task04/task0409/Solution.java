package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int min = 2147483647;
        int i = 0;

        while (input.hasNextInt()) {

            n = input.nextInt();
            //System.out.println(n);
            if (i == 0) {
                min = n;
            } else if (n < min) {
                min = n;
            }
            i++;
        }
        System.out.println(min);


    }
}