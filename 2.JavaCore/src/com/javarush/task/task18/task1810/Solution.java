package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        boolean loop = true;
        while (loop) {
            try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                 FileInputStream fileInputStream = new FileInputStream(console.readLine())) {
                long fileSize = fileInputStream.available();
                if (fileSize < 1000) {
                    loop = false;
                    throw new DownloadException();
                }

            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
