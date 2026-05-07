package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader(args[1]);
        FileWriter fileWriter = new FileWriter(args[2])) {
            if (args[0].equals("-e")){
                int c;
                while ((c = fileReader.read()) != -1){
                    fileWriter.write(c + 32);
                }
            } else if (args[0].equals("-d")){
                int c;
                while ((c = fileReader.read()) != -1){
                    fileWriter.write(c - 32);
                }
            }
        }
    }
}
