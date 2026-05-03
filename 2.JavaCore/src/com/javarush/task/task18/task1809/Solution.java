package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(console.readLine());
             FileOutputStream fos = new FileOutputStream(console.readLine())){

            List<Integer> list = new ArrayList<>();
            while (fis.available() > 0){
                list.add(fis.read());
            }
            Collections.reverse(list);

            for (Integer i : list) {
                fos.write(i);
            }
        }
    }
}
