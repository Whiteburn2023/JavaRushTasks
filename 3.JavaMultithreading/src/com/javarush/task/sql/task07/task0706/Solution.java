package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {
    private static final String URl = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URl, USER_NAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM employee LIMIT 1");
            ResultSetMetaData metaData = results.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i < columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "(" + metaData.getColumnTypeName(i) + ")" + "\t");
            }
            System.out.println();

            while (results.next()) {
                for (int i = 1; i < columnCount; i++) {
                    String string = results.getString(i);
                    System.out.print(string + "\t"+ "\t");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
