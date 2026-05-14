package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
                int c;
                int count = 1;
                while ((c = reader.read()) != -1) {
                    if (count % 2 == 0) {
                        writer.write(c);
                    }
                    count++;
                }
            }
        }
    }
}
