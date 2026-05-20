package com.javarush.task.jdk13.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse(132, 2);
        System.out.println();
        solution.recurse(132);
        System.out.println();
        solution.recurse(400, 2);
        System.out.println();
        solution.recurse(400);
        System.out.println();
        solution.recurse(38642, 2);  // 38642, 152873107, 917238642
    }

    public void recurse(int n, int div) {
        if (n <= 1){
            return;
        }
        if (n % div == 0){
            System.out.print(div + " ");
            recurse(n / div, div);
        } else {
            int newDiv = (div == 2) ? 3 : div + 2;
            recurse(n, newDiv);
        }
    }

    public void recurse(int n){
        if (n > 1){
            for (int i = 2; i <= n; i++) {
                if (n % i == 0){
                    System.out.print(i + " ");
                    recurse(n / i);
                    break;
                }

            }
        }
    }
}