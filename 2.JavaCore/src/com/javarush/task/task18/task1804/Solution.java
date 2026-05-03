package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(console.readLine())) {
            Map<Integer, Integer> map = new TreeMap<>();
            while (fis.available() > 0) {
                map.merge(fis.read(), 1, Integer::sum);
            }

//            int minValue = Integer.MAX_VALUE;
//            for (int count : map.values()) {
//                if (minValue > count) {
//                    minValue = count;
//                }
//            }

//            Integer min = Collections.min(map.values());
            //int minValue = map.values().stream().min(Integer::compare).orElse(0);

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(Collections.min(map.values()))) {
                    System.out.print(entry.getKey() + " ");
                }
            }
//            map.entrySet().stream()
//                    .filter(e -> e.getValue() == minValue)
//                    .map(Map.Entry::getKey)
//                    .forEach(b -> System.out.print(b + " "));
        }
    }
}
