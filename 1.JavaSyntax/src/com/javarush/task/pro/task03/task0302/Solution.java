package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        String name = new Scanner(System.in).nextLine();
        int age = new Scanner(System.in).nextInt();

        if (age > 17 & age < 29) {
            System.out.println(name + militaryCommissar);
        }
    }
}
