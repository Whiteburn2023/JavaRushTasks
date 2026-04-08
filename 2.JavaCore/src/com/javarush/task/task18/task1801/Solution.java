package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())
        ) {
            int maxByte = 0;
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (read > maxByte) {
                    maxByte = read;
                }
            }
            System.out.println(maxByte);
        }
    }
}
