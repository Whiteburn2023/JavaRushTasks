package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();
            String fileName3 = console.readLine();

            try (FileInputStream fis = new FileInputStream(fileName1);
                 FileOutputStream writeFileOne = new FileOutputStream(fileName2);
                 FileOutputStream writeFileTwo = new FileOutputStream(fileName3)) {

                int half = (fis.available() + 1) / 2;
                int count = 0;
                while (fis.available() > 0){
                    if (count < half){
                        writeFileOne.write(fis.read());
                        count++;
                    } else {
                        writeFileTwo.write(fis.read());
                    }
                }
            }
        }
    }
}
