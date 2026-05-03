package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//             BufferedReader reader1 = new BufferedReader(new FileReader(console.readLine()));
//             BufferedReader reader2 = new BufferedReader(new FileReader(console.readLine()))
        ) {
            allLines.addAll(Files.readAllLines(Paths.get(console.readLine())));
            forRemoveLines.addAll(Files.readAllLines(Paths.get(console.readLine())));
//            String string;
//            while ((string = reader1.readLine()) != null) {
//                allLines.add(string);
//            }
//            while ((string = reader2.readLine()) != null) {
//                forRemoveLines.add(string);
//            }
        }
        Solution solution = new Solution();
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException, IOException {

        if (new HashSet<>(allLines).containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

