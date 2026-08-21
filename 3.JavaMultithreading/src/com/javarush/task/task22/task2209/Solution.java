package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) {
        /**
         * Дербент Якутск Арзамас Рог Киев Кувшиново Капустин-Яр Стокгольм Флоренция Глен-Хоп Тобольск Нью-Йорк Афины Муром Осташков Прага Кострома Вена Амстердам Мельбурн Волгоград Минск
         * 22 слова
         */
        String fileName = new Scanner(System.in).nextLine();
        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            String line = readerFile.readLine();
            String[] split = line.split(" ");
            StringBuilder result = getLine(split);
            System.out.println(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0){
            return new StringBuilder();
        }
        List<String> list = new ArrayList<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            List<String> copy = new ArrayList<>(list);
            List<String> chain = new ArrayList<>();
            chain.add(copy.remove(i));
            while (!copy.isEmpty()) {
                String last = chain.get(chain.size() - 1);
                String next = null;
                for (String word : copy) {
                    if (word.substring(0, 1).equalsIgnoreCase(last.substring(last.length() - 1))) {
                        next = word;
                        break;
                    }
                }
                if (next == null) break;
                chain.add(next);
                copy.remove(next);
            }
            if (chain.size() > result.size()) result = chain;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : result){
            stringBuilder.append(word).append(" ");
        }
        return stringBuilder;
    }
}
