package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        signIn(str);

    }

    public static void signIn(String username){
        if (username.equals("user")){
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }

    }
}
