package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(console.readLine()))
        ) {
            String str;
            while (true) {
                str = console.readLine();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                if (str.equals("exit")) {
                    return;
                }
            }
        }
    }
}
