package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
*/

public class Solution {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME,PASSWORD);
             Statement statement = connection.createStatement()){
            ResultSet results = statement.executeQuery("SELECT DISTINCT MIN(age) as a FROM employee");
            while (results.next()){
                System.out.println(results.getInt("a"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
