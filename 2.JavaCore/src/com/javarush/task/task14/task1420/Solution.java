package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = bufferedReader.readLine();
            String string2 = bufferedReader.readLine();
            int i = Integer.parseInt(string);
            int j = Integer.parseInt(string2);

            if (i <= 0 && j <= 0) {
                return;
            }
            if (i == j) {
                System.out.println(i);
                return;
            }
            int max;
            int min;


            if (i > j){
                max = i;
                min = j;
            } else {
                max = j;
                min = i;
            }

            while (true) {
                if (max % min == 0){
                    System.out.println(min);
                    return;
                } else {
                    int remains = 0;
                    remains = max % min;
                    max = min;
                    min = remains;
                }
            }
        }
    }
}
/**
 * Метод 3. Алгоритм Евклида (для двух чисел)
 * Алгоритм: *
 * Делим большее число на меньшее. *
 * Если остаток 0, то меньшее число — это НОД. *
 * Если остаток не 0, заменяем большее число на меньшее, а меньшее — на остаток. *
 * Повторяем шаги 1–3 до получения остатка 0. Последний ненулевой остаток — искомый НОД.
 *
 * Пример: НОД(270, 186)
 * 270÷186=1 (остаток 84) → НОД(186, 84). *
 * 186÷84=2 (остаток 18) → НОД(84, 18). *
 * 84÷18=4 (остаток 12) → НОД(18, 12). *
 * 18÷12=1 (остаток 6) → НОД(12, 6). *
 * 12÷6=2 (остаток 0). *
 * Ответ: НОД(270, 186) = 6.
 */