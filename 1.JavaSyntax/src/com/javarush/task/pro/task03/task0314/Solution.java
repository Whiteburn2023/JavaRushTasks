package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        if (secret.equalsIgnoreCase(str)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
        //напишите тут ваш код


        //напишите тут ваш код

    }
}
