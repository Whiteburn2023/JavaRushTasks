package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws IOException, InterruptedException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            while (!(fileName = console.readLine()).equalsIgnoreCase("exit")) {
                new ReadThread(fileName).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
                this.fileName = fileName;
        }

        @Override
        public void run() {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {

                Map<Integer, Integer> map = new TreeMap<>();
                List<Integer> list = new ArrayList<>();
                int b;
                while ((b = bufferedInputStream.read()) != -1) {
                    map.put(b, map.getOrDefault(b, 1) + 1);
//                    map.merge(b, 1, Integer::sum);
                }
                int max = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > max) {
                        max = entry.getValue();
                        list.clear();
                        list.add(entry.getKey());
                    } else if (entry.getValue() == max) {
                        list.add(entry.getKey());
                    }
                }

                resultMap.put(fileName, list.get(0));

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
