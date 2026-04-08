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
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))
        ) {
            if (args[0].equals("-c")){
                String productName = args[1];
                String price = args[2];
                String quantity = args[3];
            }

        }
    }
}
