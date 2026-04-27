package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        Map<String, Double> map = new TreeMap<>();
//        List<String> list = Files.readAllLines(Path.of(args[0]));
//        list.forEach(string -> map.merge(string.split(" ")[0], Double.parseDouble(string.split(" ")[1]), Double::sum));

        Files.readAllLines(Path.of(args[0])).stream()
                .collect(Collectors.toMap(
                        k -> k.split(" ")[0],
                        v -> Double.parseDouble(v.split(" ")[1]),
                        Double::sum,
                        TreeMap::new
                ))
                .forEach((k,v) -> System.out.println(k + " " + v));

    }

    public static void main1(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            while (reader.ready()) {
                String[] array = reader.readLine().split(" ");
                String name = array[0];
                Double value = Double.parseDouble(array[1]);
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + value);
                } else {
                    map.put(name, value);
                }
            }
            map.forEach((k,v) -> System.out.println(k + " " + v));
        }
    }
}
