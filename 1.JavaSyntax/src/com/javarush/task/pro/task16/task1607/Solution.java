package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        LocalDate exampleDay = LocalDate.of(2020, Month.SEPTEMBER, 12);

        return exampleDay;
    }

    static LocalDate ofYearDayExample() {
        LocalDate dayNumber = LocalDate.of(2020, Month.SEPTEMBER, 12);
        int dayNum = dayNumber.getDayOfYear();
        LocalDate numberDay = LocalDate.ofYearDay(2020, dayNum);

        return numberDay;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate exampleDay = LocalDate.of(2020, Month.SEPTEMBER, 12);
        LocalDate unixDay = LocalDate.EPOCH;
        LocalDate epoch = LocalDate.ofEpochDay(exampleDay.toEpochDay() - unixDay.toEpochDay());

        return epoch;
    }
}
