package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))){

            List<String> answer = new ArrayList<>();

            while (reader.ready()){
                int count = 0;
                String str = reader.readLine();
                String[] array = str.split(" ");
                for (String string : array) {
                    for (String word : words) {
                        if (string.equalsIgnoreCase(word)){
                            count++;
                            break;
                        }
                    }
                }
                if (count == 2){
                    answer.add(str);
                }
            }
            for (String string : answer) {
                System.out.println(string);
            }
        }
    }
}
