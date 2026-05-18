package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) {
        String reclama = "JavaRush - курсы Java онлайн";
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String[] string = outputStream.toString().split("\n");
        int count = 0;
        for (String s : string) {
            System.out.println(s);
            ++count;
            if (count % 2 == 0){
                System.out.println(reclama);
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
