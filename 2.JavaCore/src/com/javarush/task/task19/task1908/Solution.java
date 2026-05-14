package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {

                while (reader.ready()){
                    String[] split = reader.readLine().split(" ");
                    for (int i = 0; i < split.length; i++) {
                        try {
                            writer.write(Integer.parseInt(split[i]) + " ");
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
        }
    }
}
