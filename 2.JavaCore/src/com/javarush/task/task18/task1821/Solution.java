package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader(args[0])) {
            Map<Character, Integer> map = new TreeMap<>();
            int c;
            while ((c = reader.read()) != -1){
                Character charC = (char) c;
                map.put(charC, map.getOrDefault(charC, 1) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}




//Map<String, Integer> map = new TreeMap<>();
//int c;
//            while ((c = reader.read()) != -1) {
//String str = String.valueOf((char) c);
//                if (map.containsKey(str)) {
//        map.put(str, map.get(str) + 1);
//        } else {
//        map.put(str, 1);
//                }
//                        }
//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//        System.out.println(entry.getKey() + " " + entry.getValue());
//        }