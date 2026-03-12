package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int min, int min1){
        return Math.min(min, min1);
    }
    public static int min(int min, int min1, int min2){
        return Math.min(Math.min(min, min1), min2);
    }
    public static int min(int min, int min1, int min2, int min3){
        return Math.min(Math.min(Math.min(min, min1), min2), min3);
    }
    public static int min(int min, int min1, int min2, int min3, int min4){
        return Math.min(Math.min(Math.min(Math.min(min, min1), min2), min3), min4);
    }

    public static int max(int max, int max1){
        return Math.max(max, max1);
    }
    public static int max(int max, int max1, int max2){
        return Math.max(Math.max(max, max1), max2);
    }
    public static int max(int max, int max1, int max2, int max3){
        return Math.max(Math.max(Math.max(max, max1), max2), max3);
    }
    public static int max(int max, int max1, int max2, int max3, int max4){
        return Math.max(Math.max(Math.max(Math.max(max, max1), max2), max3), max4);
    }
}
