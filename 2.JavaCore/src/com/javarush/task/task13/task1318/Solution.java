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

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(console.readLine());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))
        ) {
            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                System.out.println(string);
            }
        }
    }
}
