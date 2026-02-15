package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stop = "ENTER";
        int n, sum = 0;

        while (true) {
            if (input.hasNextInt()) {
                n = input.nextInt();
                sum = sum + n;
            } else if (stop.equals(input.nextLine())) {
                System.out.println(sum);
                return;
            }
        }
    }
}