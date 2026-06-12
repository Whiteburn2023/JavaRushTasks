package com.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Получение даты
*/

public class Solution {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM employee");

            while (results.next()) {
                String name = results.getString("name");
//                Timestamp created = results.getTimestamp("created");
//                LocalDateTime localDateTime = created.toLocalDateTime();
                LocalDateTime localDateTime = results.getObject("created", LocalDateTime.class);

                System.out.println(name + " " + localDateTime + "\t");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
