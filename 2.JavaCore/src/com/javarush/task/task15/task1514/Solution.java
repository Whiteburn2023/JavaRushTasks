package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(0.1, "one");
        labels.put(0.2, "two");
        labels.put(0.3, "three");
        labels.put(0.4, "four");
        labels.put(0.5, "five");
    }


    public static void main(String[] args) {


        System.out.println(labels);
    }
}

