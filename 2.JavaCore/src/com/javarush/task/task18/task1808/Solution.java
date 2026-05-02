package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();
            String fileName3 = console.readLine();

            try (FileInputStream fis = new FileInputStream(fileName1);
                 FileOutputStream fos1 = new FileOutputStream(fileName2);
                 FileOutputStream fos2 = new FileOutputStream(fileName3)) {

                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }

                byte[] allBytes = baos.toByteArray();
                int length = allBytes.length;
                int half = (length + 1) / 2;

                fos1.write(allBytes, 0, half);
                fos2.write(allBytes, half, length - half);

            }
        }
    }
}
