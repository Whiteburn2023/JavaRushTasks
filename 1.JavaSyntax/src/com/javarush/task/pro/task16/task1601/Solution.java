package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(80, 2,30);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
//        SimpleDateFormat formatter = new SimpleDateFormat("E");
//        String dayName = formatter.format(date);
//        return dayName;

        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return result;

    }
}
