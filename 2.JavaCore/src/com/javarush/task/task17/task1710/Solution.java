package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")) {
            String name = args[1];
            String sex = args[2];
            Date date = input.parse(args[3]);
            Person person = null;

            if (sex.equalsIgnoreCase("ж")){
                person = Person.createFemale(name, date);
            } else if (sex.equalsIgnoreCase("м")){
                person = Person.createMale(name, date);
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        } else if (args[0].equals("-r")) {
            int index = Integer.parseInt(args[1]);
            if (index >= 0 && index < allPeople.size()){
                Person person = allPeople.get(index);
                String sex = "";
                if (person.getSex() == Sex.MALE) {
                    sex = "м";
                } else {
                    sex = "ж";
                }
                String bd = output.format(person.getBirthDate());
                System.out.println(person.getName() + " " + sex + " " + bd);
            }
        } else if (args[0].equals("-u")) {
            int index = Integer.parseInt(args[1]);
            if (index >= 0 && index < allPeople.size()){
                Person person = allPeople.get(index);
                String name = args[2];
                String strSex = args[3];
                Date bd = input.parse(args[4]);
                Sex sex = null;
                if (strSex.equalsIgnoreCase("ж")){
                    sex = Sex.FEMALE;
                } else if (strSex.equalsIgnoreCase("м")) {
                    sex = Sex.MALE;
                }
                person.setName(name);
                person.setSex(sex);
                person.setBirthDate(bd);
            }
        } else if (args[0].equals("-d")){
            int index = Integer.parseInt(args[1]);
            if (index >= 0 && index < allPeople.size()){
                Person person = allPeople.get(index);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
        }
    }
}
