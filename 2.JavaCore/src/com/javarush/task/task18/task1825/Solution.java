package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = "";
            Map<Integer, String> map = new TreeMap<>();
            while (!(string = bufferedReader.readLine()).equalsIgnoreCase("end")) {
                int numFile = Integer.parseInt(string.substring(string.lastIndexOf("t") + 1));
                map.put(numFile, string);
            }

            for (String value : map.values()) {
                String fileName = value.substring(0, value.lastIndexOf("."));
                try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(value));
                     BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
                    while (reader.available() > 0){
                        writer.write(reader.read());
                    }
                }
            }
        }
    }
}
