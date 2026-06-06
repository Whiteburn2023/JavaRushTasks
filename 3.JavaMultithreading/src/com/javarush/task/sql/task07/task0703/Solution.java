package com.javarush.task.sql.task07.task0703;

import java.sql.*;

/* 
task0703
*/

public class Solution {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM employee");

//            ResultSetMetaData metaData = result.getMetaData();
//            int columnCount = metaData.getColumnCount();
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(metaData.getColumnName(i) + "\t");
//            }
//            System.out.println();
//            while (result.next()){
//                for (int i = 1; i <= columnCount; i++) {
//                    System.out.print(result.getString(i) +" \t");
//                }
//                System.out.println();
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
