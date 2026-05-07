package com.javarush.task.task18.task1819;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();

            try (BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(fileName1));
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileName2));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName1))){

                ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

                while (bufferedInputStream2.available() > 0){
                    arrayOutputStream.write(bufferedInputStream2.read());
                }
                while (bufferedInputStream1.available() > 0){
                    arrayOutputStream.write(bufferedInputStream1.read());
                }

                arrayOutputStream.writeTo(bufferedOutputStream);

            }


//            byte[] bytesFile1 = Files.readAllBytes(Paths.get(fileName1));
//            byte[] bytesFile2 = Files.readAllBytes(Paths.get(fileName2));
//            try (FileOutputStream fos = new FileOutputStream(fileName1)) {
//                fos.write(bytesFile2);
//                fos.write(bytesFile1);
//            }
        }
    }
}
