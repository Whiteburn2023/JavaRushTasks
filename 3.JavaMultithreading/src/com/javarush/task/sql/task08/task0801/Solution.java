package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD)){
            connection.setAutoCommit(false);
            try (Statement statement = connection.createStatement()){
                int updateSalaryDiego = statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
                int updateSalaryAmigo = statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");

                connection.commit();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
