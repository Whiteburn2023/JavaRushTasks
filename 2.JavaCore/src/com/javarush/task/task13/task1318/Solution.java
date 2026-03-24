package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
             Scanner scanner = new Scanner(fileInputStream)) {
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
            System.out.println(stringBuilder);
        }



    }
}
