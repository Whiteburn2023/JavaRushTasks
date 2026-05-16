package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        System.setOut(consoleStream);

        String[] split = result.split(" ");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[2]);
        int resultNum = 0;

        if (split[1].equals("+")){
            resultNum = num1 + num2;
        } else if (split[1].equals("-")) {
            resultNum = num1 - num2;
        } else if (split[1].equals("*")) {
            resultNum = num1 * num2;
        }

        System.out.println(num1 + " " + split[1] + " "+ num2 + " = " + resultNum);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

