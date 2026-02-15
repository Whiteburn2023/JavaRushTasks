package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        while (true){
            str = input.nextLine();
            if (str.equals("enough")){
                break;
            }
            System.out.println(str);
        }

    }
}