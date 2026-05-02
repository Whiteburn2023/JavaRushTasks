package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(console.readLine())) {
            int minByte = Integer.MAX_VALUE;
            int data;
            while ((data = fis.read()) != -1){
                if (data < minByte){
                    minByte = data;
                }
            }
            System.out.println(minByte);
        }
    }
}

