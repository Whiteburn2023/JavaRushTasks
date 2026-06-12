package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 
task0804
*/

public class Solution {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL,USER_NAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            for (int i = 0; i < 5; i++) {
                preparedStatement.setString(1,"employee_" + i);
                preparedStatement.setInt(2,30 + i);
                preparedStatement.setString(3,"i = " + i);
                preparedStatement.addBatch();
            }
            int[] results = preparedStatement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
