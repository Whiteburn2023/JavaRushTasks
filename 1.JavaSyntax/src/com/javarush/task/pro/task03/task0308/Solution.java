package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();

        boolean isOne = x > 0 && y > 0;
        boolean isTwo = x < 0 && y > 0;
        boolean isThree = x < 0 && y < 0;
        boolean isFour = x > 0 && y < 0;

        if (isOne) {
            System.out.println(1);
        } else if (isTwo) {
            System.out.println(2);
        } else if (isThree) {
            System.out.println(3);
        } else if (isFour) {
            System.out.println(4);
        } else {
            System.out.println("точка ушла в неизвестность");
        }


    }
}
