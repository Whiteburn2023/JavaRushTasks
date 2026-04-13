package com.javarush.task.task18.task1803;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of(new Scanner(System.in).nextLine()));
        Map<Byte, Integer> map = IntStream.range(0, bytes.length)
                .boxed().collect(Collectors.toMap(i -> bytes[i], i -> 1, Integer::sum));
        map.entrySet().stream()
                .filter(pair -> pair.getValue().equals(Collections.max(map.values())))
                .forEach(pair -> System.out.print(pair.getKey() + " "));
    }



    public static void main1(String[] args) throws Exception {
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
