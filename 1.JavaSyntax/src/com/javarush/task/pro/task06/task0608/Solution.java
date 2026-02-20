package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введи число: ");
        long n = input.nextLong();

        System.out.println(cube(n));

    }

    public static long cube(long value){
        return value * value * value;
    }

    //напишите тут ваш код
}
