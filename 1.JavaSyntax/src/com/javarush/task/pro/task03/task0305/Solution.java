package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        boolean isOneTwo = a == b;
        boolean isTwoThree = b == c;
        boolean isOneThree = a == c;

        if (isOneTwo && isTwoThree) {
            System.out.println(a + " " + b + " " + c);
        } else {
            if (isOneTwo) {
                System.out.println(a + " " + b);
            } else if (isTwoThree) {
                System.out.println(b + " " + c);
            } else if (isOneThree) {
                System.out.println(a + " " + c);
            }
        }

    }
}
