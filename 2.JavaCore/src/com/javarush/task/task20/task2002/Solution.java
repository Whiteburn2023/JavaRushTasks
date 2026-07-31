package com.javarush.task.task20.task2002;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (PrintWriter printWriter = new PrintWriter(outputStream)) {
                printWriter.println(users.size());
                if (!users.isEmpty()) {
                    for (User user : users) {
                        printWriter.println(user.getFirstName());
                        printWriter.println(user.getLastName());
                        printWriter.println(user.getBirthDate().getTime());
                        printWriter.println(user.isMale());
                        printWriter.println(user.getCountry().name());
                        printWriter.flush();
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                int count = Integer.parseInt(bufferedReader.readLine());
                List<User> loadedUsers = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    String firstName = bufferedReader.readLine();
                    String lastName = bufferedReader.readLine();
                    long birthMillis = Long.parseLong(bufferedReader.readLine());
                    boolean isMale = Boolean.parseBoolean(bufferedReader.readLine());
                    User.Country country = User.Country.valueOf(bufferedReader.readLine());

                    User user = new User();
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setBirthDate(new Date(birthMillis));
                    user.setMale(isMale);
                    user.setCountry(country);
                    loadedUsers.add(user);
                }
                this.users = loadedUsers;
            }
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}