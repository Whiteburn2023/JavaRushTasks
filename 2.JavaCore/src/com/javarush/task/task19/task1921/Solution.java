package com.javarush.task.task19.task1921;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
//            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
//            while (bufferedReader.ready()){
//                String string = bufferedReader.readLine();
//                String name = string.replaceAll("\\d", "").trim();
//                String date = string.replaceAll("\\D", " ").trim();
//
//                PEOPLE.add(new Person(name, format.parse(date)));
//
//            }
//        }

        Files.readAllLines(Paths.get(args[0])).stream()
                .map(str -> new Person(
                        str.replaceAll("\\d", "").trim(),
                        Date.from(
                                Instant.from(LocalDate.parse(str.replaceAll("\\D", " ").trim(), DateTimeFormatter.ofPattern("dd MM yyyy")))
                        )
                        ))
                .forEach(PEOPLE::add);

    }
}
