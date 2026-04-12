package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            while (bufferedReader.ready()){
                String string = bufferedReader.readLine();
                if (!string.equals("exit")){
                    if (string.contains(".")){                        
                        print(Double.parseDouble(string));
                    } else if () {
                        
                    }
                } else {
                    return;
                }
                
            }
        }
        
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
