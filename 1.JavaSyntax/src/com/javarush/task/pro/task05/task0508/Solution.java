package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        strings = new String[6];
        String temp = "";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = input.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            temp = strings[i];
                for (int j = 0; j < strings.length; j++) {
                    if (temp == strings[j]) {
                        strings[j] = null;
                    }
                }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}