package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число: ");
        long n = input.nextLong();
        System.out.println(ninthDegree(n));

    }

    public static long ninthDegree(long n){

        return cube(cube(n));
    }

    public static long cube(long a){
        return a*a*a;
    }

    //напишите тут ваш код
}
