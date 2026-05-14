package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] split = fileScanner.nextLine().toString().split(" ");
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            String dataString = split[3] + " " + split[4] + " " + split[5];
            Date dataBirthday = formatter.parse(dataString);

            return new Person(split[1], split[2], split[0], dataBirthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
