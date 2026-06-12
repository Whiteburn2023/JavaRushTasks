package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
*/

public class Solution {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT name, weight, birthday, inn FROM employee");

            while (results.next()){
                String name = results.getString("name");
                Float weight = results.getFloat("weight");
                Date birthday = results.getDate("birthday");
                Long inn = results.getLong("inn");

                System.out.println(name + " " + weight + " " + birthday + " " + inn + "\t");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
