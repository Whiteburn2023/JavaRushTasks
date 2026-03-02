package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> progLanguages = new HashMap<>();
        progLanguages.put(0, "Java");
        progLanguages.put(1, "Kotlin");
        progLanguages.put(2, "Go");
        progLanguages.put(3, "Javascript");
        progLanguages.put(4, "Typescript");
        progLanguages.put(5, "Python");
        progLanguages.put(6, "PHP");
        progLanguages.put(7, "C++");
        return progLanguages;
    }
}
