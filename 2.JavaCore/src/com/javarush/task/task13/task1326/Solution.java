package com.javarush.task.task13.task1326;

import javax.imageio.IIOException;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(console.readLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))){

            List<Integer> list = new ArrayList<>();

            while (reader.ready()){
                String string = reader.readLine();
                int number = Integer.parseInt(string);
                if (number % 2 == 0){
                    list.add(number);
                }
            }
            list.sort(Comparator.naturalOrder());
            list.forEach(System.out::println);
        }

    }
}
