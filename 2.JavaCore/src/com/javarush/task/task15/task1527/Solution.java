package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String url = bufferedReader.readLine();

        int index = url.indexOf('?');
        String substring = url.substring(index + 1);
        String[] split = substring.split("&");
        String paramObj = "";
        double paramD = 0.0;
        boolean flag = false;

        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("=")) {
                if (split[i].contains("obj")) {
                    paramObj = split[i].substring(split[i].indexOf('=') + 1);
                    try {
                        paramD = Double.parseDouble(paramObj);
                        flag = true;

                    } catch (NumberFormatException e) {
                        flag = true;
                    }
                }
                split[i] = split[i].substring(0, split[i].indexOf('='));
            }
            System.out.print(split[i] + " ");
        }
        System.out.println();

        if (flag && paramD != 0){
            alert(paramD);
        } else if (flag) {
            alert(paramObj);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
