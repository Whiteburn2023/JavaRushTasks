package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(console.readLine())){
            int someByte;
            Set<Integer> set = new TreeSet<>();
            while ((someByte = fis.read()) != -1){
                set.add(someByte);
            }
            set.forEach(n -> System.out.print(n + " "));
        }
    }
}
