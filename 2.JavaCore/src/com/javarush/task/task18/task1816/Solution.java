package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args[0] == null) {
            return;
        }

        try (

//             BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
                FileReader reader = new FileReader(args[0])) {
            int count = 0;
            while (reader.ready()) {
                int symbol = reader.read();
                if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
                    count++;
                }
            }
            System.out.println(count);
        }

        long count = Files.readString(Paths.get(args[0])).chars()
                .filter(cp -> cp >= 65 && cp <= 122 && Character.isAlphabetic(cp))
                .count();
        System.out.println(count);

    }
}
