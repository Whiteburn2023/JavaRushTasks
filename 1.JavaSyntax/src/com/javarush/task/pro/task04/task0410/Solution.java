package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int min = 0;
        int min2 = 0;

        while (input.hasNextInt()){
            n = input.nextInt();
            if (i == 0){
                min = n;
                min2 = n;
            } else if (n < min) {
                min2 = min;
                min = n;
            } else if (n > min && min == min2){
                min2 = n;
            } else if (n > min && n < min2) {
                min2 = n;
            }
            i++;
        }

        System.out.println(min2);

    }
}