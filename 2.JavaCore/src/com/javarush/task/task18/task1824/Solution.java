package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            while ((fileName = console.readLine()) != null) {
                try (FileReader fileReader = new FileReader(fileName)) {

                } catch (FileNotFoundException e) {
                    System.out.println(fileName);
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
