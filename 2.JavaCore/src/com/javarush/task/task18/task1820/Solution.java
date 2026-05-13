package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))){

            String[] split = reader.readLine().split(" ");
            for (int i = 0; i < split.length; i++) {
                double parsedDouble = Double.parseDouble(split[i].trim());
                long round = Math.round(parsedDouble);
                writer.write(round + " ");
            }
        }
    }
}
