package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(console.readLine())
        ) {
            Map<Integer, Integer> map = new TreeMap<>();
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (map.containsKey(read)) {
                    map.put(read, map.get(read) + 1);
                } else {
                    map.put(read, 1);
                }
            }
            int max = Collections.max(map.values());
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max){
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }
}
