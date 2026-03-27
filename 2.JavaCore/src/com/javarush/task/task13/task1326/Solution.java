package com.javarush.task.task13.task1326;

import javax.imageio.IIOException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String src = "C:\\OTUS\\JavaRushTasks\\2.txt";

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(src))) {
            int ch;
            while ((ch = inputStreamReader.read()) != -1){
                if (ch >= '0' && ch <= '9') {
                    int digit = ch -'0';
                    if (digit % 2 == 0) {
                        System.out.println((char) ch);
                    }
                }
            }
        }




    }
}
