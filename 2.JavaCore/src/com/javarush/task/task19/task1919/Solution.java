package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    /**
     * public static void main(String[] args) throws IOException {
     * Files.readAllLines(Path.of(args[0])).stream()
     * .collect(Collectors.toMap(
     * k -> k.split(" ")[0],
     * v -> Double.parseDouble(v.split(" ")[1]),
     * Double::sum,
     * TreeMap::new
     * ))
     * .forEach((k,v) -> System.out.println(k + " " + v));
     * }
     */

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0])) ){
            String string = "";
            Map<String, Double> map = new TreeMap<>();
            while ((string = reader.readLine()) != null){
                String[] strings = string.split(" ");
                String name = strings[0];
                Double salary = Double.parseDouble(strings[1]);
                if (map.containsKey(name)){
                    map.put(name, map.get(name) + salary);
                } else {
                    map.put(name, salary);
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
