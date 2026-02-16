package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0){
            int[] array = new int[n];
            for (int i = 0; i < n; i++){
                array[i] = input.nextInt();
            }

            if (n % 2 != 0){
                for (int i = 0; i < array.length; i++){
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < array.length; i++){
                    System.out.println(array[array.length - i - 1]);
                }
            }

        }

    }
}
