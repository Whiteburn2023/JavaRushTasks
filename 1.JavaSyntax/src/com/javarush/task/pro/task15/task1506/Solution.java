package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            {
                for (String str : lines) {
                    StringBuilder output = new StringBuilder();

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != '.' && str.charAt(i) != ',' && str.charAt(i) != ' ') {
                            output.append(str.charAt(i));
                        }
                    }
                    System.out.println(output);
                }

            }
        }
    }
}

