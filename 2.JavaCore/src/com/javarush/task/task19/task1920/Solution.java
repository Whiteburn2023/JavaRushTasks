package com.javarush.task.task19.task1920;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Самый богатый
*/

public class Solution {
    //    public static void main(String[] args) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
//            Map<String, Double> map = new TreeMap<>();
//            while (reader.ready()){
//                String[] split = reader.readLine().split(" ");
//                String name = split[0];
//                Double value = Double.parseDouble(args[1]);
//                if (map.containsKey(name)){
//                    map.put(name, map.get(name) + value);
//                } else {
//                    map.put(name, value);
//                }
//            }
//            Double max = Collections.max(map.values());
//            for (Map.Entry<String, Double> entry : map.entrySet()) {
//                if (entry.getValue().equals(max)){
//                    System.out.println(entry.getKey());
//                }
//            }
//        }
//    }
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = Files.readAllLines(Paths.get(args[0])).stream()
                .collect(Collectors.toMap(s -> s.split(" ")[0], s -> Double.parseDouble(s.split(" ")[1]), (a, b) -> Double.sum(a, b)));

        map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Collections.max(map.values())))
                .forEach(entry -> System.out.println(entry.getKey()));


//                .max(Map.Entry.comparingByValue())
//                        .map(Map.Entry::getKey)
//                        .orElse(null);
//        System.out.println(string);


//                .map(str -> str.split(" "))
//                .forEach(strings -> map.merge(strings[0], Double.parseDouble(strings[1]), (a, b) -> Double.sum(a,b)));


    }

}
