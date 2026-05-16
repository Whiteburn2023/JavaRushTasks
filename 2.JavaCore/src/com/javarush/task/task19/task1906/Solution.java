package com.javarush.task.task19.task1906;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Четные символы
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(console.readLine());
             FileWriter writer = new FileWriter(console.readLine())) {
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

    public static void main(String[] args) throws IOException {
        String string = Files.readString(Paths.get(new Scanner(System.in).nextLine()));
        Files.writeString(Paths.get
                (new Scanner(System.in).nextLine()),
                Arrays.stream(string.split(""))
                        .filter(str -> string.indexOf(str) % 2 != 0)
                        .collect(Collectors.joining())
                );

    }
}

