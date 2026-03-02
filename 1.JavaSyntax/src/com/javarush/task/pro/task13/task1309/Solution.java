package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("jor fjf", 4.4);
        grades.put("ert gff", 4.1);
        grades.put("qaz edc", 4.8);
        grades.put("rfv yhn", 4.3);
        grades.put("yhn ijn", 4.5);

    }
}
