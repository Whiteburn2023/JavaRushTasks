package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            String fileName3 = bufferedReader.readLine();

            try (BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(fileName2));
                 BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(fileName3));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName1, true))) {

                int b;
                while ((b = bis1.read()) != -1){
                    bos.write(b);
                }

                while ((b = bis2.read()) != -1){
                    bos.write(b);
                }
            }


//            try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName2));
//                 BufferedReader reader2 = new BufferedReader(new FileReader(fileName3));
//                 BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileName1, true))) {
//                String str;
//                while ((str = reader1.readLine()) != null) {
//                    writer1.write(str);
//                }
//                while ((str = reader2.readLine()) != null) {
//                    writer1.write(str);
//                }
//            }
        }
    }
}
