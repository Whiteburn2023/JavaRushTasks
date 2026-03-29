package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scanner.nextLine()));

        do {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")){
                bufferedWriter.write(str);
                break;
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        } while (scanner.hasNext());

        bufferedWriter.close();

    }
}
