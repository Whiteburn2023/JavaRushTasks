package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 3; i < args.length; i += 3) {
                        String name = args[i - 2];
                        String sex = args[i - 1];
                        Date date = input.parse(args[i]);
                        Person person = null;

                        if (sex.equalsIgnoreCase("ж")) {
                            person = Person.createFemale(name, date);
                        } else if (sex.equalsIgnoreCase("м")) {
                            person = Person.createMale(name, date);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 4; i < args.length; i += 4) {
                        int index = Integer.parseInt(args[i - 3]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            String name = args[i - 2];
                            String strSex = args[i - 1];
                            Date bd = input.parse(args[i]);
                            Sex sex = null;
                            if (strSex.equalsIgnoreCase("ж")) {
                                sex = Sex.FEMALE;
                            } else if (strSex.equalsIgnoreCase("м")) {
                                sex = Sex.MALE;
                            }
                            person.setName(name);
                            person.setSex(sex);
                            person.setBirthDate(bd);
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i <= allPeople.size(); i++) {
                        int index = Integer.parseInt(args[i]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i <= allPeople.size(); i++) {
                        int index = Integer.parseInt(args[i]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            String sex = "";
                            if (person.getSex() == Sex.MALE) {
                                sex = "м";
                            } else if (person.getSex() == Sex.FEMALE) {
                                sex = "ж";
                            }
                            String bd = output.format(person.getBirthDate());
                            System.out.println(person.getName() + " " + sex + " " + bd);
                        }
                    }
                }
                break;
        }
    }
}
/**
 * -c Миронов м 14/11/1999 Моргунов м 10/10/1000
 * -u 0 Миронов м 14/11/1999 1 Моргунов м 10/10/1000
 * -d 0 1
 * -i 0 1
 */