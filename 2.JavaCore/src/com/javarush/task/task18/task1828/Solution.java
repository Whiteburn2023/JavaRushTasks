package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        Map<Integer, String> map = new LinkedHashMap<>();
        int findInt = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            if (args.length != 0){
                findInt = Integer.parseInt(args[1].trim());
                while (reader.ready()){
                    String string = reader.readLine();
                    int id = Integer.parseInt(string.substring(0, 8).trim());
                    map.put(id, string);
                }
                if (args[0].equals("-u")){
                    String findId = args[1].trim();
                    String productName = args[2];
                    String price = args[3];
                    String quantity = args[4];
                    String format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", findId, productName, price, quantity);
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        if (entry.getKey() == findInt ){
                            entry.setValue(format);
                        }
                    }
                } else if (args[0].equals("-d")) {
                    map.remove(findInt);
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    writer.write(entry.getValue());
                    writer.newLine();
                }
            }
        }
    }
}
