package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])){
            int c;
            double count = 0;
            double countSpace = 0;
            while ((c = fileReader.read()) != -1){
                count++;
                if (c == ' '){
                    countSpace++;
                }
            }
            System.out.printf("%.2f", (countSpace / count) * 100);
        }

    }
}
