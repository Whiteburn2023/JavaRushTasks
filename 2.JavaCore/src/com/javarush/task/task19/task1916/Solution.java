package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();

            List<String> listOne = new ArrayList<>();
            List<String> listTwo = new ArrayList<>();

            try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
                 BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {

                while (reader1.ready()) {
                    listOne.add(reader1.readLine());
                }

                while (reader2.ready()) {
                    listTwo.add(reader2.readLine());
                }

                for (String str1 : listOne) {
                    for (String str2 : listTwo) {
                        if (str1.equals(str2)) {
                            lines.add(new LineItem(Type.SAME, str1));
                            break;
                        } else if (!str1.contains(str2)) {
                            lines.add(new LineItem(Type.REMOVED, str1));
                            break;
                        } else if (!str2.contains(str1)) {
                            lines.add(new LineItem(Type.ADDED, str2));
                        }
                    }
                }
            }

        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
            System.out.println("type: " + type + " line: " + line);
        }
    }

}
