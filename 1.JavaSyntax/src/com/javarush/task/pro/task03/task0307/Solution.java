package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n < 20 || n > 60)
        System.out.println("можно не работать");
    }
}
