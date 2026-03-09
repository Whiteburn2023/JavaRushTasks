package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Long max = Long.MAX_VALUE;
        Instant timestamp = Instant.ofEpochMilli(max);
        return timestamp;
    }

    static Instant getMaxFromSeconds() {
        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return timestamp;
    }

    static Instant getMaxFromSecondsAndNanos() {

        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
        return timestamp;
    }
}
