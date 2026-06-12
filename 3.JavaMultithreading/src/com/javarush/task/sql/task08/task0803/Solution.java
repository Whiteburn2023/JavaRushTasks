package com.javarush.task.sql.task08.task0803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 
task0803
*/

public class Solution {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        String name = "Harry";
        int age = 18;
        String smth = "Senior pomidor";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(3,smth);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
