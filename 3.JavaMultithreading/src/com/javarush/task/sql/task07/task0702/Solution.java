package com.javarush.task.sql.task07.task0702;

import java.sql.*;

/* 
task0702
*/

public class Solution {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME,PASSWORD)){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT 7 * 8");

//            while (resultSet.next()){
//                int resultSetInt = resultSet.getInt("7 * 8");
//                System.out.println(resultSetInt);
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
