package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))
        ) {
            int maxId = 0;
            while (reader.ready()){
                String substring = reader.readLine().substring(0, 8).trim();
                int number = Integer.parseInt(substring);
                if (maxId < number){
                    maxId = number;
                }
            }
            maxId++;

            if (args.length != 0) {
                if (args[0].equals("-c")) {
                    String productName = args[1];
                    String price = args[2];
                    String quantity = args[3];
                    //%n%-8.8s%-30.30s%-8.8s%-4.4s

                    String format = String.format("%8d%-30.30s%-8.8s%-4.4s", maxId, productName, price, quantity);
                    writer.newLine();
                    writer.write(format);

                }
            }
        }
    }
}
