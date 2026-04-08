package com.javarush.task.task18.task1828;

import java.io.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))
        ) {
            while (reader.ready()){
                int findId = 0;
                String string = reader.readLine().substring(0, 8).trim();
                int number = Integer.parseInt(string);
                if (findId < number)
            }

        }



    }
}
