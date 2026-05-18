package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){

            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()){
                String[] split = reader.readLine().split("\\s+");
                for (String string : split) {
                    if (string.length() > 6){
                        stringBuilder.append(string).append(",");
                    }
                }
            }
            if (stringBuilder.length() > 0){
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            writer.write(stringBuilder.toString());

        }

    }
}
