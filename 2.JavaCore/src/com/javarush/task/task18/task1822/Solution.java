package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))){

            while (reader.ready()){
                String str = reader.readLine().trim();
                String id = str.split(" ")[0].trim();
                if (args[0].equals(id)){
                    System.out.println(str);
                }
            }
        }
    }
}
