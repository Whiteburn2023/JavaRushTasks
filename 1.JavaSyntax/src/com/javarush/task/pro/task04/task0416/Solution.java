package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bottle = input.nextInt();
        int human = input.nextInt();

        double result = (double) bottle / human;

        System.out.println(result);
    }
}