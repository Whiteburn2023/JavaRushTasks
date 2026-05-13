package com.javarush.task.task19.task1907;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in)) {
//             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
//            int count = 0;
//            while (reader.ready()) {
//                String[] split = reader.readLine().replaceAll("\\p{P}", " ").split(" ");
//                for (String str : split){
//                    if (str.equals("world")){
//                        count++;
//                    }
//                }
//            }            System.out.println(count);
//
//        }

        long count = Arrays.stream(Files.readString(Paths.get(new Scanner(System.in).nextLine()))
                        .replaceAll("\\p{P}", " ").split(" "))
                .filter(str -> str.equals("world"))
                .count();

        System.out.println(count);

    }
}
